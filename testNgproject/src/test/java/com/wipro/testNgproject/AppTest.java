package com.wipro.testNgproject;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {

    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test(priority = 1, description = "Verifies successful user registration")
    public void testUserSignUp() throws InterruptedException {
        driver.get("https://www.demoblaze.com/index.html");
        
        WebElement signUpLink = driver.findElement(By.id("signin2"));
        signUpLink.click();
        
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signInModal")));

        String username = "pjkishore"+System.currentTimeMillis();
        
        driver.findElement(By.id("sign-username")).sendKeys(username);
        Thread.sleep(2000);
        driver.findElement(By.id("sign-password")).sendKeys("pjkishore");
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//button[text()='Sign up']")).click();
        Thread.sleep(2000);
        
        wait.until(ExpectedConditions.alertIsPresent());
        Alert signUpAlert = driver.switchTo().alert();
        String alertText = signUpAlert.getText();
        Assert.assertEquals(alertText, "Sign up successful.");
        signUpAlert.accept();
        Thread.sleep(2000);
    }
    
    @Test(priority = 2, description = "Performs login and then continues with an end-to-end purchase")
    public void testLoginAndPurchaseFlow() throws InterruptedException {
        driver.get("https://www.demoblaze.com/index.html");
        
        WebElement loginLink = driver.findElement(By.id("login2"));
        loginLink.click();
        
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logInModal")));
        
        driver.findElement(By.id("loginusername")).sendKeys("pjkishore");
        Thread.sleep(2000);
        driver.findElement(By.id("loginpassword")).sendKeys("pjkishore");
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        Thread.sleep(2000);
        
        WebElement welcomeMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nameofuser")));
        Assert.assertTrue(welcomeMessage.getText().contains("Welcome pj"));
        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[normalize-space()='Iphone 6 32gb']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[normalize-space()='Add to cart']")).click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.alertIsPresent()).accept();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//li[@class='nav-item active']//a[@class='nav-link']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[3]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[normalize-space()='MacBook air']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[normalize-space()='Add to cart']")).click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.alertIsPresent()).accept();
        Thread.sleep(2000);
        
        driver.findElement(By.id("cartur")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//button[normalize-space()='Place Order']")).click();
        Thread.sleep(2000);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name"))).sendKeys("Pj kishore");
        Thread.sleep(2000);
        driver.findElement(By.id("country")).sendKeys("India");
        Thread.sleep(2000);
        driver.findElement(By.id("city")).sendKeys("hyd");
        Thread.sleep(2000);
        driver.findElement(By.id("card")).sendKeys("4581 4455 9999");
        Thread.sleep(2000);
        driver.findElement(By.id("month")).sendKeys("August");
        Thread.sleep(2000);
        driver.findElement(By.id("year")).sendKeys("2025");
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//button[normalize-space()='Purchase']")).click();
        Thread.sleep(2000);
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[normalize-space()='Thank you for your purchase!']")));
        Assert.assertTrue(driver.findElement(By.xpath("//h2[normalize-space()='Thank you for your purchase!']")).isDisplayed());
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
        Thread.sleep(2000);
    }
    
    @AfterMethod
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

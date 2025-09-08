package com.wipro.testNgproject;

import java.time.Duration;
import java.util.UUID; // Import UUID class
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
    
    // invalid credentials

    @Test(priority = 3, description = "TC_N01: Verifies sign up with an existing username")
    public void testSignUpWithExistingUser() throws InterruptedException {
        driver.get("https://www.demoblaze.com/index.html");
        
        driver.findElement(By.id("signin2")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signInModal")));
        Thread.sleep(2000);

        driver.findElement(By.id("sign-username")).sendKeys("tester");
        driver.findElement(By.id("sign-password")).sendKeys("password");
        driver.findElement(By.xpath("//button[text()='Sign up']")).click();
        
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String alertText = alert.getText();
        Assert.assertEquals(alertText, "This user already exist.");
        alert.accept();
        Thread.sleep(2000);
    }

    @Test(priority = 4, description = "TC_N02: Verifies login with an incorrect password")
    public void testLoginWithIncorrectPassword() throws InterruptedException {
        driver.get("https://www.demoblaze.com/index.html");
        
        driver.findElement(By.id("login2")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logInModal")));
        Thread.sleep(2000);
        
        driver.findElement(By.id("loginusername")).sendKeys("tester");
        driver.findElement(By.id("loginpassword")).sendKeys("incorrectpassword");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();

        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String alertText = alert.getText();
        Assert.assertEquals(alertText, "Wrong password.");
        alert.accept();
        Thread.sleep(2000);
    }
    
    @Test(priority = 5, description = "TC_N03 & N04: Verifies login with blank credentials")
    public void testLoginWithBlankCredentials() throws InterruptedException {
        driver.get("https://www.demoblaze.com/index.html");

        driver.findElement(By.id("login2")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logInModal")));
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//button[text()='Log in']")).click();

        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String alertText = alert.getText();
        Assert.assertEquals(alertText, "Please fill out Username and Password.");
        alert.accept();
        Thread.sleep(2000);
    }
    
    @Test(priority = 6, description = "TC_N05: Signs up and then verifies checkout with missing required fields")
    public void testSignUpAndCheckoutWithMissingFields() throws InterruptedException {
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
        
        driver.findElement(By.xpath("//a[normalize-space()='Samsung galaxy s6']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Add to cart']"))).click();
        wait.until(ExpectedConditions.alertIsPresent()).accept();
        
        driver.findElement(By.id("cartur")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Place Order']"))).click();
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("orderModal")));
        Thread.sleep(2000);
        
        driver.findElement(By.id("country")).sendKeys("India");
        driver.findElement(By.id("city")).sendKeys("Hyderabad");
        driver.findElement(By.id("month")).sendKeys("September");
        driver.findElement(By.id("year")).sendKeys("2025");
        
        driver.findElement(By.xpath("//button[normalize-space()='Purchase']")).click();

        Alert purchaseAlert = wait.until(ExpectedConditions.alertIsPresent());
        String alertText = purchaseAlert.getText();
        
        Assert.assertEquals(alertText, "Please fill out Name and Creditcard.");
        purchaseAlert.accept();
        Thread.sleep(2000);
    }

    @AfterMethod
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

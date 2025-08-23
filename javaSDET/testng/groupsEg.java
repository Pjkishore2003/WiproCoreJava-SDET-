package com.wipro.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class groupsEg {

    WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod(alwaysRun = true)
    public void setupTest() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://practicetestautomation.com/practice-test-login/");
    }

    @Test(priority = 1, groups = {"smoke", "positive", "regression"})
    public void testValidLogin() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id='username']")).sendKeys("student");
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Password123");
        driver.findElement(By.xpath("//*[@id='submit']")).click();

        WebElement successHeading = driver.findElement(By.xpath("//h1[contains(text(), 'Logged In Successfully')]"));
        Assert.assertTrue(successHeading.isDisplayed(), "Success message not displayed.");
        Thread.sleep(2000);

        WebElement logoutButton = driver.findElement(By.xpath("//a[contains(text(),'Log out')]"));
        Assert.assertTrue(logoutButton.isDisplayed(), "Logout button not visible.");

        System.out.println("Valid login test passed.");
    }

    @Test(priority = 2, groups = {"negative", "regression"})
    public void testInvalidLogin() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id='username']")).sendKeys("invalid");
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("wrongpass");
        driver.findElement(By.xpath("//*[@id='submit']")).click();

        WebElement errorMessage = driver.findElement(By.xpath("//*[@id='error']"));
        Assert.assertTrue(errorMessage.isDisplayed(), "Error message not displayed.");
        Assert.assertEquals(errorMessage.getText(), "Your username is invalid!", "Unexpected error message.");
        Thread.sleep(2000);

        System.out.println("Invalid login test passed (error correctly shown).");
    }

    @AfterMethod(alwaysRun = true)
    public void tearDownTest() {
        if (driver != null) {
            driver.quit();
        }
    }

    @AfterClass(alwaysRun = true)
    public void tearDownClass() {
        System.out.println("All tests in LabTask3 completed.");
    }
}

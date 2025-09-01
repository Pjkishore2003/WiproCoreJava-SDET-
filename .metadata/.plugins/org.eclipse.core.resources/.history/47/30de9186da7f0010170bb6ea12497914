package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import utils.DriverFactory;

public class StepDefinitions {
    WebDriver driver;
    WebDriverWait wait;

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        // Here, get the driver instance that was created in the @Before hook
        driver = DriverFactory.getDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
    }

    // ... (rest of the steps remain the same as the previous correction)
    @When("user enters the {string} and {string}")
    public void user_enters_the(String username, String password) {
        WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        usernameField.clear();
        usernameField.sendKeys(username);

        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    @When("user clicks on the login button")
    public void user_clicks_on_the_login_button() {
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Login']")));
        loginButton.click();
    }

    @Then("user should see an error message {string}")
    public void user_should_see_error_message(String expectedMessage) {
        WebElement errorElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(@class,'oxd-alert-content-text')]")));
        String actualMessage = errorElement.getText();
        Assert.assertEquals(actualMessage, expectedMessage, "Error message does not match");
    }

    @Then("user remains on the login page")
    public void user_remains_on_the_login_page() {
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("/auth/login"), "User was redirected from the login page");
    }

    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() {
        WebElement dashboardHeader = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h6[text()='Dashboard']")));
        Assert.assertTrue(dashboardHeader.isDisplayed(), "Dashboard header is not visible, login failed.");
    }
}
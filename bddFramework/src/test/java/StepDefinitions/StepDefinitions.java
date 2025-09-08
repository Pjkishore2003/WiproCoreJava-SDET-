package StepDefinitions;

import pages.Demoblaze;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;

public class StepDefinitions {

    private WebDriver driver;
    private Demoblaze demoblaze;

    @Given("I am on the Demoblaze home page")
    public void i_am_on_the_demoblaze_home_page() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        demoblaze = new Demoblaze(driver);
        demoblaze.navigateToHomePage();
    }

    @When("I navigate to the registration page")
    public void i_navigate_to_the_registration_page() {
        demoblaze.navigateToRegistrationPage();
    }

    @When("I enter account details with username {string} and password {string}")
    public void i_enter_account_details_with_username_and_password(String username, String password) {
        String uniqueUsername = username + System.currentTimeMillis();
        demoblaze.enterRegistrationDetails(uniqueUsername, password);
    }
    
    @When("I enter account details with existing username {string} and password {string}")
    public void i_enter_account_details_with_existing_username_and_password(String username, String password) {
        demoblaze.enterRegistrationDetails(username, password);
    }


    @When("I click the {string} button")
    public void i_click_the_button(String buttonText) {
        if (buttonText.equals("Sign up")) {
            demoblaze.clickSignupButton();
        } else if (buttonText.equals("Log in")) {
            demoblaze.clickLoginButton();
        }
    }

    @Then("a {string} alert should be displayed")
    public void a_alert_should_be_displayed(String expectedAlertText) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
            String actualAlertText = alert.getText();
            Assert.assertEquals(actualAlertText, expectedAlertText);
            alert.accept();
        } catch (org.openqa.selenium.NoAlertPresentException e) {
            Assert.fail("No alert was displayed. Expected: " + expectedAlertText);
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }

    @When("I navigate to the login page")
    public void i_navigate_to_the_login_page() {
        demoblaze.navigateToLoginPage();
    }

    @When("I enter login username {string} and password {string}")
    public void i_enter_login_username_and_password(String username, String password) {
        demoblaze.enterLoginCredentials(username, password);
    }

    @Then("I should be logged in as {string}")
    public void i_should_be_logged_in_as(String username) {
        Assert.assertTrue(demoblaze.isUserLoggedIn(username));
    }

    @When("I add {string} to the cart")
    public void i_add_to_the_cart(String product) {
        demoblaze.addProductToCart(product);
    }

    @When("I view the shopping cart")
    public void i_view_the_shopping_cart() {
        demoblaze.navigateToCart();
    }

    @When("I navigate to the checkout page")
    public void i_navigate_to_the_checkout_page() {
        demoblaze.navigateToPlaceOrder();
    }
    
    @When("I attempt to purchase without filling name and credit card")
    public void i_attempt_to_purchase_without_filling_name_and_credit_card() {
        demoblaze.fillOutPartialPurchaseForm("India", "Hyderabad", "September", "2025");
        demoblaze.clickPurchaseButton();
    }

    @When("I fill in valid shipping and payment details")
    public void i_fill_in_valid_shipping_and_payment_details() {
        demoblaze.fillOutPurchaseForm("Pj kishore", "India", "hyd", "4581 4455 9999", "August", "2025");
    }

    @When("I confirm the purchase")
    public void i_confirm_the_purchase() {
        demoblaze.clickPurchaseButton();
    }

    @Then("a purchase confirmation page should be displayed")
    public void a_purchase_confirmation_page_should_be_displayed() {
        Assert.assertTrue(demoblaze.isPurchaseSuccessful());
        demoblaze.confirmPurchase();
        if (driver != null) {
            driver.quit();
        }
    }
}


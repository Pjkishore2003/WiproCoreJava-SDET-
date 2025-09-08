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
    public void i_am_on_the_demoblaze_home_page() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Removed implicit wait
        demoblaze = new Demoblaze(driver);
        demoblaze.navigateToHomePage();
        Thread.sleep(2000);
    }

    @When("I navigate to the registration page")
    public void i_navigate_to_the_registration_page() throws InterruptedException {
        demoblaze.navigateToRegistrationPage();
        Thread.sleep(2000);
    }

    @When("I enter account details with username {string} and password {string}")
    public void i_enter_account_details_with_username_and_password(String username, String password) throws InterruptedException {
        String uniqueUsername = username + System.currentTimeMillis();
        demoblaze.enterRegistrationDetails(uniqueUsername, password);
        Thread.sleep(2000);
    }
    
    @When("I enter account details with existing username {string} and password {string}")
    public void i_enter_account_details_with_existing_username_and_password(String username, String password) throws InterruptedException {
        demoblaze.enterRegistrationDetails(username, password);
        Thread.sleep(2000);
    }


    @When("I click the {string} button")
    public void i_click_the_button(String buttonText) throws InterruptedException {
        if (buttonText.equals("Sign up")) {
            demoblaze.clickSignupButton();
        } else if (buttonText.equals("Log in")) {
            demoblaze.clickLoginButton();
        }
        Thread.sleep(2000);
    }

    @Then("a {string} alert should be displayed")
    public void a_alert_should_be_displayed(String expectedAlertText) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
            String actualAlertText = alert.getText();
            Assert.assertEquals(actualAlertText, expectedAlertText);
            Thread.sleep(2000); // Wait after alert appears
            alert.accept();
            Thread.sleep(2000); // Wait after alert is closed
        } catch (org.openqa.selenium.NoAlertPresentException e) {
            Assert.fail("No alert was displayed. Expected: " + expectedAlertText);
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }

    @When("I navigate to the login page")
    public void i_navigate_to_the_login_page() throws InterruptedException {
        demoblaze.navigateToLoginPage();
        Thread.sleep(2000);
    }

    @When("I enter login username {string} and password {string}")
    public void i_enter_login_username_and_password(String username, String password) throws InterruptedException {
        demoblaze.enterLoginCredentials(username, password);
        Thread.sleep(2000);
    }

    @Then("I should be logged in as {string}")
    public void i_should_be_logged_in_as(String username) throws InterruptedException {
        Assert.assertTrue(demoblaze.isUserLoggedIn(username));
        Thread.sleep(2000);
    }

    @When("I add {string} to the cart")
    public void i_add_to_the_cart(String product) throws InterruptedException {
        demoblaze.addProductToCart(product);
        Thread.sleep(2000);
    }

    @When("I view the shopping cart")
    public void i_view_the_shopping_cart() throws InterruptedException {
        demoblaze.navigateToCart();
        Thread.sleep(2000);
    }

    @When("I navigate to the checkout page")
    public void i_navigate_to_the_checkout_page() throws InterruptedException {
        demoblaze.navigateToPlaceOrder();
        Thread.sleep(2000);
    }
    
    @When("I attempt to purchase without filling name and credit card")
    public void i_attempt_to_purchase_without_filling_name_and_credit_card() throws InterruptedException {
        demoblaze.fillOutPartialPurchaseForm("India", "Hyderabad", "September", "2025");
        Thread.sleep(2000);
        demoblaze.clickPurchaseButton();
        Thread.sleep(2000);
    }

    @When("I fill in valid shipping and payment details")
    public void i_fill_in_valid_shipping_and_payment_details() throws InterruptedException {
        demoblaze.fillOutPurchaseForm("Pj kishore", "India", "hyd", "4581 4455 9999", "August", "2025");
        Thread.sleep(2000);
    }

    @When("I confirm the purchase")
    public void i_confirm_the_purchase() throws InterruptedException {
        demoblaze.clickPurchaseButton();
        Thread.sleep(2000);
    }

    @Then("a purchase confirmation page should be displayed")
    public void a_purchase_confirmation_page_should_be_displayed() throws InterruptedException {
        Assert.assertTrue(demoblaze.isPurchaseSuccessful());
        Thread.sleep(2000);
        demoblaze.confirmPurchase();
        Thread.sleep(2000);
        if (driver != null) {
            driver.quit();
        }
    }
}


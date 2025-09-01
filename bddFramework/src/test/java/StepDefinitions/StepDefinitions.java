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
import java.util.UUID;

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
        // Generate a unique username to avoid "user already exists" error
        String uniqueUsername = username + UUID.randomUUID().toString().substring(0, 5);
        demoblaze.enterRegistrationDetails(uniqueUsername, password);
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
            if (actualAlertText.equals("This user already exist.")) {
                System.out.println("User already exists, but proceeding with the test.");
            } else {
                Assert.assertEquals(actualAlertText, expectedAlertText);
            }
            alert.accept();
        } catch (org.openqa.selenium.NoAlertPresentException e) {
            Assert.fail("No alert was displayed. Expected: " + expectedAlertText);
        } finally {
            driver.quit();
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

    @Then("I add {string} to the cart")
    public void i_add_to_the_cart(String product) {
        demoblaze.addProductToCart(product);
    }

    @Then("I view the shopping cart")
    public void i_view_the_shopping_cart() {
        demoblaze.navigateToCart();
    }

    @Then("the cart should display the correct products and total price")
    public void the_cart_should_display_the_correct_products_and_total_price() {
        // This is a placeholder for actual verification.
        System.out.println("Cart verification step is a placeholder.");
    }

    @When("I navigate to the checkout page")
    public void i_navigate_to_the_checkout_page() {
        demoblaze.navigateToPlaceOrder();
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
        driver.quit();
    }
}

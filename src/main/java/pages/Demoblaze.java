package pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demoblaze {
    
    private WebDriver driver;
    private WebDriverWait wait;

    // Locators for login and registration
    private final By loginLink = By.id("login2");
    private final By signupLink = By.id("signin2");
    private final By loginModal = By.id("logInModal");
    private final By signupModal = By.id("signInModal");
    private final By loginUsernameField = By.id("loginusername");
    private final By loginPasswordField = By.id("loginpassword");
    private final By signupUsernameField = By.id("sign-username");
    private final By signupPasswordField = By.id("sign-password");
    private final By loginButton = By.xpath("//button[text()='Log in']");
    private final By signupButton = By.xpath("//button[text()='Sign up']");
    private final By welcomeMessage = By.id("nameofuser");

    // Locators for cart and checkout
    private final By addToCartButton = By.xpath("//a[normalize-space()='Add to cart']");
    private final By cartLink = By.id("cartur");
    private final By placeOrderButton = By.xpath("//button[normalize-space()='Place Order']");
    private final By nameField = By.id("name");
    private final By countryField = By.id("country");
    private final By cityField = By.id("city");
    private final By creditCardField = By.id("card");
    private final By monthField = By.id("month");
    private final By yearField = By.id("year");
    private final By purchaseButton = By.xpath("//button[normalize-space()='Purchase']");
    private final By thankYouMessage = By.xpath("//h2[normalize-space()='Thank you for your purchase!']");
    private final By okButton = By.xpath("//button[normalize-space()='OK']");

    // Constructor
    public Demoblaze(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Actions
    public void navigateToHomePage() {
        driver.get("https://www.demoblaze.com/index.html");
    }

    public void navigateToLoginPage() {
        driver.findElement(loginLink).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginModal));
    }

    public void navigateToRegistrationPage() {
        driver.findElement(signupLink).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(signupModal));
    }

    public void enterLoginCredentials(String username, String password) {
        driver.findElement(loginUsernameField).sendKeys(username);
        driver.findElement(loginPasswordField).sendKeys(password);
    }

    public void enterRegistrationDetails(String username, String password) {
        driver.findElement(signupUsernameField).sendKeys(username);
        driver.findElement(signupPasswordField).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public void clickSignupButton() {
        driver.findElement(signupButton).click();
    }

    public boolean isUserLoggedIn(String username) {
        WebElement welcomeMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(welcomeMessage));
        return welcomeMsg.getText().contains("Welcome " + username.substring(0, 2));
    }

    public void addProductToCart(String productName) {
        driver.findElement(By.xpath("//a[normalize-space()='" + productName + "']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(addToCartButton)).click();
        wait.until(ExpectedConditions.alertIsPresent()).accept();
        driver.get("https://www.demoblaze.com/index.html");
    }

    public void navigateToCart() {
        driver.findElement(cartLink).click();
    }

    public void navigateToPlaceOrder() {
        driver.findElement(placeOrderButton).click();
    }

    public void fillOutPurchaseForm(String name, String country, String city, String creditCard, String month, String year) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(nameField)).sendKeys(name);
        driver.findElement(countryField).sendKeys(country);
        driver.findElement(cityField).sendKeys(city);
        driver.findElement(creditCardField).sendKeys(creditCard);
        driver.findElement(monthField).sendKeys(month);
        driver.findElement(yearField).sendKeys(year);
    }

    public void clickPurchaseButton() {
        driver.findElement(purchaseButton).click();
    }

    public boolean isPurchaseSuccessful() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(thankYouMessage));
        return driver.findElement(thankYouMessage).isDisplayed();
    }

    public void confirmPurchase() {
        driver.findElement(okButton).click();
    }
}

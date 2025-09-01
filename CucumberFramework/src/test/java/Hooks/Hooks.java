package Hooks;
 
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
 
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.DriverFactory;
 
public class Hooks {

    @Before
    public void setUp() {
         // Create a new driver instance before each scenario
         DriverFactory.getDriver();
         System.out.println("Browser launched before scenario");
    }

    @After
    public void tearDown(Scenario scenario) {
        WebDriver driver = DriverFactory.getDriver(); // Get the current driver instance
        if(scenario.isFailed()) {
            try {
                // Ensure the driver is still available before attempting to take a screenshot
                byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", "Failed Screenshot"); 
            } catch (Exception e) {
                System.out.println("Could not take screenshot. Driver may not be available.");
                e.printStackTrace();
            }
        }
        DriverFactory.quitDriver();
        System.out.println("Browser closed after the scenario");
    }
}
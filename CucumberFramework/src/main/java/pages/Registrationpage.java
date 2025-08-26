package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Registrationpage {
    WebDriver driver;

    public Registrationpage(WebDriver driver) {
        this.driver = driver;
    }

    By firstName = By.xpath("//*[@id=\"name\"]");
    By email = By.xpath("//*[@id=\"email\"]");
    By gender = By.xpath("//*[@id=\"gender\"]");
    By mobile = By.xpath("//*[@id=\"mobile\"]");
    By dob = By.xpath("//*[@id=\"dob\"]t");
    By subject = By.xpath("//*[@id=\"subjects\"]");
    By hobbies = By.xpath("//*[@id=\"hobbies\"]");
    By pictureUpload = By.xpath("//*[@id=\"picture\"]");
    By currentAddress = By.xpath("//*[@id=\"picture\"]");
    By stateDropdown = By.xpath("//*[@id=\"state\"]");
    By cityDropdown = By.xpath("//*[@id=\"city\"]");
    By submitButton = By.xpath("/html/body/main/div/div/div[2]/form/div[11]/input");
    By confirmationMessage = By.id("example-modal-sizes-title-lg");

    public void enterFirstName(String fname) {
        driver.findElement(firstName).sendKeys(fname);
    }

    public void enterEmail(String mail) {
        driver.findElement(email).sendKeys(mail);
    }

    public void selectGender() {
        driver.findElement(gender).click();
    }

    public void enterMobile(String mob) {
        driver.findElement(mobile).sendKeys(mob);
    }

    public void enterDOB(String date) {
        WebElement dobField = driver.findElement(dob);
        dobField.click();
        dobField.clear();
        dobField.sendKeys(date);
        dobField.submit();
    }

    public void enterSubject(String sub) {
        driver.findElement(subject).sendKeys(sub + "\n");
    }

   public void selectHobbies(String[] hobbies) {
    for (String hobby : hobbies) {
        hobby = hobby.trim().toLowerCase();

        switch (hobby) {
            case "sports":
                driver.findElement(By.id("hobbies-sports")).click();
                break;
            case "reading":
                driver.findElement(By.id("hobbies-reading")).click();
                break;
            case "music":
                driver.findElement(By.id("hobbies-music")).click();
                break;
            default:
                System.out.println("Unknown hobby: " + hobby);
        }
    }
}


    public void uploadPicture(String filePath) {
        driver.findElement(pictureUpload).sendKeys(filePath);
    }

    public void enterCurrentAddress(String address) {
        driver.findElement(currentAddress).sendKeys(address);
    }

    public void selectState(String state) {
        driver.findElement(stateDropdown).sendKeys(state + "\n");
    }

    public void selectCity(String city) {
        driver.findElement(cityDropdown).sendKeys(city + "\n");
    }

    public void submitForm() {
    WebElement submit = driver.findElement(submitButton);
    ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].click();", submit);
}


    public String getConfirmationMessage() {
        return driver.findElement(confirmationMessage).getText();
    }
}

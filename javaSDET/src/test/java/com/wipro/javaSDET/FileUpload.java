package com.wipro.javaSDET;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {
	public static void main(String[]args) throws InterruptedException {
		ChromeOptions ChromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(ChromeOptions);
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		WebElement fileupload = driver.findElement(By.xpath("//input[@id='file-upload']"));
		fileupload.sendKeys("\"C:\\Users\\kisho\\yes yes.txt\"");
		WebElement submit = driver.findElement(By.xpath("//input[@id='file-submit']"));
		submit.click();
		WebElement validationmsg = driver.findElement(By.xpath("//h3[normalize-space()='File Uploaded!']"));
		if (validationmsg.isDisplayed()) { 
			System.out.println("The message is displayed propoerly");
		}else {
			System.out.println("the message is not displayed");
		}
	}

}
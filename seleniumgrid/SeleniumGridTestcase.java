package com.wiprojuly.seleniumgrid;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
 
public class SeleniumGridTestcase extends HelperClass {
 
	

	@Test

	public void login() throws InterruptedException {


		WebElement Username = getDriver().findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));

		Username.sendKeys("Admin");

		Thread.sleep(1000);

		// name locator 

		WebElement Password  = getDriver().findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));

		Password.sendKeys("admin123");

		Thread.sleep(1000);

		WebElement LoginButton = getDriver().findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));

		LoginButton.click();

		Thread.sleep(2000);

	}
 
}

 
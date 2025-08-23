package com.wipro.javaSDET;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {
	public static void main(String[]args) throws InterruptedException {
		ChromeOptions ChromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(ChromeOptions);
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		WebElement simplealert = driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(1) > button"));
		simplealert.click();
		Thread.sleep(2000);
		Alert alt = driver.switchTo().alert();
		alt.accept();
		Thread.sleep(2000);
		WebElement confirmalert = driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(2) > button"));
		confirmalert.click();
		Thread.sleep(2000);
		Alert alt1 =driver.switchTo().alert();
		alt1.dismiss();
		Thread.sleep(2000);
		WebElement promptalert = driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(3) > button"));
		promptalert.click();
		Thread.sleep(2000);
		Alert alt2 = driver.switchTo().alert();
		String alerttext = alt2.getText();
		System.out.println(alerttext);
		alt2.sendKeys("kishore");
		Thread.sleep(2000);
		alt2.accept();
		Thread.sleep(2000);
	}
}
package com.wipro.javaSDET;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeywordEg {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions chromeOption = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOption);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		act.moveToElement(email).keyDown(Keys.SHIFT).sendKeys("hello").keyUp(Keys.SHIFT).build().perform();
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		act.moveToElement(password).sendKeys("hi").release().build().perform();
		Thread.sleep(3000);
		}
}
	
	
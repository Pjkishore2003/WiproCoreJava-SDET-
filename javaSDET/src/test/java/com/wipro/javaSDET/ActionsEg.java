package com.wipro.javaSDET;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsEg {
	public static void main(String[]args) throws InterruptedException {
		ChromeOptions ChromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(ChromeOptions);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Actions act = new Actions (driver);
		WebElement sell = driver.findElement(By.xpath("//a[normalize-space()='sell']"));
		act.doubleClick(sell).perform();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		WebElement mobiles = driver.findElement(By.xpath("//a[normalize-space()='Mobiles']"));
		act.contextClick(mobiles).perform();	
}
}
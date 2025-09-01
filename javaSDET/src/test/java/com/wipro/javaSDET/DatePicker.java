package com.wipro.javaSDET;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {
	public static void main(String[]args) throws InterruptedException {
		ChromeOptions ChromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(ChromeOptions);
		driver.get("https://ui.shadcn.com/docs/components/date-picker");
		Thread.sleep(2000);
		WebElement trigger = driver.findElement(By.xpath("//*[@id=\"date\"]"));
		trigger.click();
		Thread.sleep(2000); 
		WebElement trigger2 = driver.findElement(By.xpath("//button[@data-day='14/8/2025]"));
		trigger2.click();
		Thread.sleep(2000);
		WebElement trigger3 = driver.findElement(By.xpath("//button[@data-day='22/8/2025]"));
		trigger2.click();
		Thread.sleep(2000);
		
	}

}
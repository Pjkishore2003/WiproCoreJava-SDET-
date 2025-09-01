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

public class WindowHandlingEg {
	public static void main(String[]args) throws InterruptedException {
		ChromeOptions ChromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(ChromeOptions);
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize();
		WebElement clickhere = driver.findElement(By.xpath("https://the-internet.herokuapp.com/windows"));
		Object[] windowHandles = driver.getWindowHandles().toArray();
		System.out.println(windowHandles);
		driver.switchTo().window((String) windowHandles[1]);
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window((String) windowHandles[0]);
		driver.quit();
		}
}
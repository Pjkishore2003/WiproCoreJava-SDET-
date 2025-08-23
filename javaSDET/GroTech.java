package com.wipro.javaSDET;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GroTech {
	public static void main(String[]args) throws InterruptedException {
		ChromeOptions ChromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(ChromeOptions);
		driver.get("https://grotechminds.com/multiple-select/?");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement drdm = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div/div/div/form/span/span[1]/span/ul"));
		Select sel = new Select(drdm);
		sel.deselectByVisibleText("Motorcycle");
		Thread.sleep(2000);
		sel.deselectByVisibleText("Sedan");
		Thread.sleep(2000);
		sel.deselectAll();
		
	}
}
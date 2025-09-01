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

public class Scrolling {
	public static void main(String[]args) throws InterruptedException {
		ChromeOptions ChromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(ChromeOptions);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement aboutamz = driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[4]/div/ul[1]/li[7]/a/h5"));
		Actions act = new Actions(driver);
		Thread.sleep(4000);
		act.scrollToElement(aboutamz).perform();
		aboutamz.click();
	}
}
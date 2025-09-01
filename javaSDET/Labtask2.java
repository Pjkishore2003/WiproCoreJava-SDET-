package com.wipro.javaSDET;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Labtask2 {
	private static final boolean Exception = false;
	public static void main(String[]args) throws InterruptedException {
		ChromeOptions ChromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(ChromeOptions);
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		driver.manage().window().maximize();
		WebElement name = driver.findElement(By.name("Name"));
		name.sendKeys("kishore");
		Thread.sleep(1500);
		WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		email.sendKeys("kishore@gmail.com");
		Thread.sleep(1500);
		WebElement gender = driver.findElement(By.xpath("//*[@id=\"gender\"]"));
		gender.click();
		Thread.sleep(1500);
		WebElement mobile = driver.findElement(By.xpath("//*[@id=\"mobile\"]"));
		mobile.sendKeys("987654");
		Thread.sleep(1500);
		WebElement dob = driver.findElement(By.xpath("//button[@data-day='05/01/2003]"));
		dob.click();
		Thread.sleep(1500);
		WebElement sub = driver.findElement(By.xpath("//*[@id=\"subjects\"]"));
		sub.sendKeys("cse");
		Thread.sleep(1500);
		WebElement uploadElement = driver.findElement(By.xpath("/html/body"));
		uploadElement.click();
		uploadElement.sendKeys("\"C:\\Users\\kisho\\OneDrive\\Pictures\\wallpaperflare.com_wallpaper (1).jpg\"");
		Thread.sleep(1500);
		WebElement curentadd = driver.findElement(By.xpath("//*[@id=\"picture\"]"));
		curentadd.sendKeys("hyd12");
		Thread.sleep(1500);
		WebElement stateDropdown = driver.findElement(By.xpath("//*[@id=\"state\"]"));
		Select stateSelect = new Select(stateDropdown);
		stateSelect.selectByVisibleText("NCR");
		Thread.sleep(1500);
		WebElement cityDropdown = driver.findElement(By.xpath("//*[@id=\"city\"]"));
		Select citySelect = new Select(cityDropdown);
		citySelect.selectByVisibleText("Agra");
		Thread.sleep(5000);
	}
}
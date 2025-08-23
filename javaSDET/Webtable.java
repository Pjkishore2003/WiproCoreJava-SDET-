package com.wipro.javaSDET;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtable {
	public static void main(String[]args) throws InterruptedException {
		ChromeOptions ChromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(ChromeOptions);
		driver.get("https://the-internet.herokuapp.com/tables");
		driver.manage().window().maximize();
		List<WebElement> cols = (List<WebElement>) driver.findElement(By.xpath("//table[@id = 'table1']/thread/tr[1]/th"));
		int colcount = cols.size();
		System.out.println(colcount);
		WebElement celltext = driver.findElement(By.xpath("//table[@id = 'table1']/tbody/tr[4]/td[3]"));
		String actualcelltext = celltext.getText();
		String expectedcelltext = "tconway@earthlink.net";
		if(actualcelltext.equalsIgnoreCase(expectedcelltext)) {
			System.out.println("the text matches");
		}else {
			System.out.println("the text do not match");
		}
	}
}
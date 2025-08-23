package com.wipro.javaSDET;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileDownload {
	public static void main(String[]args) throws InterruptedException {
		ChromeOptions ChromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(ChromeOptions);
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		WebElement fdowm = driver.findElement(By.xpath("//*[@id=\"uploaded-files\"]"));
		fdowm.click();
		File f = new File("\"C:\\Users\\kisho\\yes yes.txt\"");
		if(f.exists()) {
			System.out.println("the file is present");
			
		}else {
			System.out.println("not present");
		}
		
	}

}
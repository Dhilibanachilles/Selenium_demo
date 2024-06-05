package com.starAgile.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageHRM {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhili\\Documents\\Drivers_Selenium\\chromedriver.exe");
		// invoke the Chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
		WebElement username = driver.findElement(By.xpath("//input[@name = 'username']"));
		username.sendKeys("Admin");
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.xpath("//input[@name = 'password']"));
		password.sendKeys("admin123");
		Thread.sleep(2000);
		
		WebElement loginbutton = driver.findElement(By.xpath("//button[@type= 'submit']"));
		loginbutton.click();
		Thread.sleep(2000);
	}

}

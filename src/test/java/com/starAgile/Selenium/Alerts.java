package com.starAgile.Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhili\\Documents\\Drivers_Selenium\\chromedriver.exe");
		// invoke the Chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		WebElement alert = driver.findElement(By.xpath("//input[@value = 'Alert']"));
		alert.click();
		Alert alt = driver.switchTo().alert();
		Thread.sleep(2000);
		alt.accept();
		Thread.sleep(2000);
		
		WebElement confirmation = driver.findElement(By.xpath("//input[@value = 'Confirmation Box']"));
		confirmation.click();
		Alert conf = driver.switchTo().alert();
		Thread.sleep(2000);
		conf.dismiss();
		Thread.sleep(2000);
		
		WebElement prompt = driver.findElement(By.xpath("//input[@value = 'Prompt']"));
		prompt.click();
		Alert prom = driver.switchTo().alert();
		prom.sendKeys("Drake");
		Thread.sleep(2000);
		prom.accept();
		Thread.sleep(10000);
		
		driver.close();
		
	}

}

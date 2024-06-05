package com.starAgile.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEg {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhili\\Documents\\Drivers_Selenium\\chromedriver.exe");
		// invoke the Chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(3000);
		
		WebElement email = driver.findElement(By.xpath("//input[@id = 'email']"));
		Actions builder = new Actions(driver);
		
		Action seriesOfAction = builder.moveToElement(email).click().keyDown(email, Keys.SHIFT).sendKeys("Drake").build();
		seriesOfAction.perform();
		
		Thread.sleep(10000);
		driver.close();
		
	}

}

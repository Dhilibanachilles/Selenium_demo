package com.starAgile.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhili\\Documents\\Drivers_Selenium\\chromedriver.exe");
		// invoke the Chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/dropdown");
		
		Thread.sleep(3000);
		WebElement dropDown = driver.findElement(By.xpath("//select[@id = 'dropdown']"));
		Select dd = new Select(dropDown);
		dd.selectByIndex(1);
		Thread.sleep(3000);
		dd.selectByValue("2");
		Thread.sleep(3000);
		dd.selectByVisibleText("Option 1");
		
		
	}

}

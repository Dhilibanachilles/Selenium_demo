package com.starAgile.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhili\\Documents\\Drivers_Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		
		WebElement multiselect = driver.findElement(By.xpath("//select[@id = 'multi-select']"));
		Select ms = new Select(multiselect);
		
		ms.selectByIndex(3);
		ms.selectByIndex(4);
		ms.deselectByValue("New York");
		
	}

}

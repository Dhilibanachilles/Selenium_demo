package com.starAgile.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhili\\Documents\\Drivers_Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.netflix.com/browse");
	//						OR
	//	driver.navigate().to("https://www.netflix.com/browse");
		
		driver.navigate().forward();
		
		driver.navigate().back();
		
		driver.navigate().refresh();
	}

}

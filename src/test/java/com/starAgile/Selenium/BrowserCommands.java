package com.starAgile.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhili\\Documents\\Drivers_Selenium\\chromedriver.exe");
		// invoke the Chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.netflix.com/browse");
		
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);
		
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
		driver.close();
		
	//	driver.quit();
	}

}

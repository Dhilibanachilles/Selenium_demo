package com.starAgile.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InvokeFirefox {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.driver", "C:\\Users\\dhili\\Documents\\Drivers_Selenium\\geckodriver.exe");
		// Invoke firefox browser
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/browse");
	}

}

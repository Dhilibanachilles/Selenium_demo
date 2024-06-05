package com.starAgile.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class InvokeMicrosoftEdge {
	
	public static void main(String[] args) {
		System.getProperty("webdriver.edge.driver", "C:\\Users\\dhili\\Documents\\Drivers_Selenium\\msedgedriver.exe");
		// Invoke Microsoft edge browser
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/browse");
	}

}

package com.starAgile.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestNGTest1 {
	
	@Test
	public void testCase1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhili\\Documents\\Drivers_Selenium\\chromedriver.exe");
		// invoke the Chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/browse");
	}
	
	@Test
	public void testCase2() {
		System.setProperty("webdriver.firefox.driver", "C:\\Users\\dhili\\Documents\\Drivers_Selenium\\geckodriver.exe");
		// Invoke firefox browser
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/browse");
	}
	
	@Test
	public void testCase3() {
		System.getProperty("webdriver.edge.driver", "C:\\Users\\dhili\\Documents\\Drivers_Selenium\\msedgedriver.exe");
		// Invoke Microsoft edge browser
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/browse");
	}
	
}

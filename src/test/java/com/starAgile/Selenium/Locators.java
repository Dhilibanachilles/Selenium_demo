package com.starAgile.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhili\\Documents\\Drivers_Selenium\\chromedriver.exe");
		// invoke the Chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.in");
		
		WebElement language = driver.findElement(By.id("searchDropdownBox"));
		
		WebElement navToList = driver.findElement(By.className("nav-a nav-a-2   nav-progressive-attribute"));
		
		WebElement searchBox = driver.findElement(By.name("field-keywords"));
		searchBox.sendKeys("PS5 Controller");
		
		WebElement linkTextBestSellers = driver.findElement(By.linkText("Best Sellers"));
		
		WebElement linkTextTodaysdeal = driver.findElement(By.partialLinkText("Today's"));
		
		WebElement tagNameInput = driver.findElement(By.tagName("input"));
		
		WebElement locationCssSelector = driver.findElement(By.cssSelector("#glow-ingress-line2"));
		
		WebElement allAbsXPath = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[4]/div[1]/a[1]/i[1]"));
		
		WebElement searchRelXPath = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		
		// indexing (//input[@type = 'checkbox'])[1]
	}

}

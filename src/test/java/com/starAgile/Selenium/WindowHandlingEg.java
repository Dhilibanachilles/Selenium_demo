package com.starAgile.Selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandlingEg {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dhili\\Documents\\Drivers_Selenium\\chromedriver.exe");
		// invoke the Chrome browser
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/windows");
		
		// get parent window handle
		
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		
		WebElement click = driver.findElement(By.xpath("//a[contains(text(), 'Click Here')]"));
		click.click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		
		Iterator<String> iterator = windowHandles.iterator();
		wait.until(ExpectedConditions.visibilityOf(click));
		
		while(iterator.hasNext()) {
			
			String childWindow = iterator.next();
			
			if(!parentWindow.equalsIgnoreCase(childWindow)) {
				
				driver.switchTo().window(childWindow);
				String text = driver.findElement(By.xpath("//h3[contains(text(), 'New Window')]")).getText();
				System.out.println(text);
				driver.close();
				
				driver.switchTo().defaultContent();
			}
			
		}
		
	}

}

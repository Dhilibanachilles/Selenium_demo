package com.starAgile.Selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorEg {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhili\\Documents\\Drivers_Selenium\\chromedriver.exe");
		// invoke the Chrome browser
		WebDriver driver = new ChromeDriver();
	//	driver.manage().window().maximize();
		
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.in");
		
		Thread.sleep(2000);
		
	//	WebElement footerElement = driver.findElement(By.xpath("//a[contains(text(),'Privacy Policy')]"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0, 1000)", "");
		
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0, -200)", "");
		
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(300, 0)", "");
		
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(-200, 800)", "");
		
	}

}

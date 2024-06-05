package com.starAgile.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextEg {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhili\\Documents\\Drivers_Selenium\\chromedriver.exe");
		// invoke the Chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
		WebElement getTextOfLoginPage = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/p[1]"));
		String text = getTextOfLoginPage.getText();
		System.out.println(text);
		
		WebElement getAttributeOfButton = driver.findElement(By.xpath("//button"));
		String attribute = getAttributeOfButton.getAttribute("class");
		String cssValue = getAttributeOfButton.getCssValue("color");
		System.out.println(attribute);
		System.out.println(cssValue);
	}

}

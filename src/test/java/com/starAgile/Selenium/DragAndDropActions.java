package com.starAgile.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropActions {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhili\\Documents\\Drivers_Selenium\\chromedriver.exe");
		// invoke the Chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		Thread.sleep(2000);
		
		WebElement source = driver.findElement(By.xpath("//div[@id='column-a']"));
		WebElement desti = driver.findElement(By.xpath("//div[@id='column-b']"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(source, desti).perform();
		
		Thread.sleep(5000);
		driver.close();
		
	}

}

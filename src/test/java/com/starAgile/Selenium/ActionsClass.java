package com.starAgile.Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhili\\Documents\\Drivers_Selenium\\chromedriver.exe");
		// invoke the Chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/context_menu");

		WebElement rtClick = driver.findElement(By.xpath("//div[@id = 'hot-spot']"));

		// perform is used to perform the task
		// build is used to combine the tasks
		Actions act = new Actions(driver);
		act.contextClick(rtClick).perform();
		Alert aler = driver.switchTo().alert();
		aler.accept();
		Thread.sleep(2000);

		WebElement ele = driver.findElement(By.xpath("//a[contains(text(),'Elemental Selenium')]"));
		act.doubleClick(ele).perform();

		Thread.sleep(7000);
		driver.close();

	}

}

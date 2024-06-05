package com.starAgile.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesEg {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhili\\Documents\\Drivers_Selenium\\chromedriver.exe");
		// invoke the Chrome browser
		WebDriver driver = new ChromeDriver();
	//	driver.manage().window().maximize();
		
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://the-internet.herokuapp.com/iframe");
		
		// xpath
		WebElement frame = driver.findElement(By.xpath("//iframe[@id = 'mce_0_ifr']"));
		driver.switchTo().frame(frame);
		
		WebElement content = driver.findElement(By.xpath("//body[@id = 'tinymce']"));
		content.clear();
		content.sendKeys("KaKaRoT");
		
		// index
	//	driver.switchTo().frame(0);
		
		// id
	//	driver.switchTo().frame("mce_0_ifr");
	}

}

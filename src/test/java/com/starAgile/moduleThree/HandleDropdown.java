package com.starAgile.moduleThree;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown {
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhili\\Documents\\Drivers_Selenium\\chromedriver.exe");
		// invoke the Chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dropdown");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		WebElement dropDown = driver.findElement(By.xpath("//select[@id = 'dropdown']"));
		Select dd = new Select(dropDown);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		dd.selectByIndex(1);
		dd.selectByValue("2");
		dd.selectByVisibleText("Option 1");
	}

}

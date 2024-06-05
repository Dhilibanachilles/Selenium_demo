package com.starAgile.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassSession {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhili\\Documents\\Drivers_Selenium\\chromedriver.exe");
		// invoke the Chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/contact_us#google_vignette");
		
		WebElement name = driver.findElement(By.name("name"));
		name.sendKeys("Drake");
		
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("drake@yahoo.com");
		
		WebElement subject = driver.findElement(By.name("subject"));
		subject.sendKeys("Class Session");
		
		WebElement yourMessage = driver.findElement(By.id("message"));
		yourMessage.sendKeys("Automating using locators");
		
		WebElement uploadFile = driver.findElement(By.name("upload_file"));
		uploadFile.click();
		
		WebElement feedBack = driver.findElement(By.tagName("a"));
		feedBack.click();
		
		WebElement submitButton = driver.findElement(By.className("btn btn-primary pull-left submit_form"));
	//	submitButton.click();
	}

}

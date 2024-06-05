package com.starAgile.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsEg {
	
	@Test
	public void ass() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhili\\Documents\\Drivers_Selenium\\chromedriver.exe");
		// invoke the Chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.xpath("//input[@name = 'username']"));
	//	username.sendKeys("Admin");
		Thread.sleep(2000);
		username.clear();
		
		WebElement password = driver.findElement(By.xpath("//input[@name = 'password']"));
		password.sendKeys("admin123");
		Thread.sleep(2000);
		
		WebElement loginbutton = driver.findElement(By.xpath("//button[@type= 'submit']"));
		loginbutton.click();
		Thread.sleep(2000);
		
		WebElement errMsg = driver.findElement(By.xpath("(//span[@class = 'oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message'])[1]"));
		System.out.println(errMsg);
		String actualresult = errMsg.getText();
		System.out.println(actualresult);
		
		String expectedResult = "Required";
		
		Assert.assertEquals(expectedResult, actualresult);
		
		Thread.sleep(10000);
		driver.close();
	}

}

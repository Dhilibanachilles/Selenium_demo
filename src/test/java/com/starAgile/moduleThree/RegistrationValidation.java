package com.starAgile.moduleThree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationValidation {

	@Test(priority = 0)
	public void testcase1() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dhili\\Documents\\Drivers_Selenium\\chromedriver.exe");
		// invoke the Chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://codenboxautomationlab.com/registration-form/");

		Thread.sleep(2000);
		WebElement firstName = driver.findElement(By.xpath("//input[@id = 'nf-field-17']"));
		firstName.sendKeys("Drake");
		Thread.sleep(2000);

		WebElement lastName = driver.findElement(By.xpath("//input[@id = 'nf-field-18']"));
		lastName.sendKeys("Scott");
		Thread.sleep(2000);

		WebElement email = driver.findElement(By.xpath("//input[@id = 'nf-field-19']"));
		email.clear();
		Thread.sleep(2000);

		WebElement radioButton = driver.findElement(By.xpath("//label[@id = 'nf-label-class-field-23-4']"));
		radioButton.click();
		Thread.sleep(2000);

		WebElement loginbutton = driver.findElement(By.xpath("//input[@id= 'nf-field-15']"));
		loginbutton.click();
		Thread.sleep(2000);

		WebElement errMsg = driver.findElement(By.xpath("//div[@id = 'nf-error-19']"));
		System.out.println(errMsg);
		String actualresult = errMsg.getText();
		System.out.println(actualresult);

		String expectedResult = "This is a required field.";

		Assert.assertEquals(expectedResult, actualresult);
	}

	@Test(priority = 1)
	public void testcase2() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dhili\\Documents\\Drivers_Selenium\\chromedriver.exe");
		// invoke the Chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://codenboxautomationlab.com/registration-form/");

		Thread.sleep(2000);
		WebElement firstName = driver.findElement(By.xpath("//input[@id = 'nf-field-17']"));
		firstName.clear();
		Thread.sleep(2000);

		WebElement lastName = driver.findElement(By.xpath("//input[@id = 'nf-field-18']"));
		lastName.sendKeys("Scott");
		Thread.sleep(2000);

		WebElement email = driver.findElement(By.xpath("//input[@id = 'nf-field-19']"));
		email.sendKeys("admin123@gmail.com");
		Thread.sleep(2000);

		WebElement radioButton = driver.findElement(By.xpath("//label[@id = 'nf-label-class-field-23-4']"));
		radioButton.click();
		Thread.sleep(2000);

		WebElement loginbutton = driver.findElement(By.xpath("//input[@id= 'nf-field-15']"));
		loginbutton.click();
		Thread.sleep(2000);

		WebElement errMsg = driver.findElement(By.xpath("//div[@class = 'nf-error-msg nf-error-required-error']"));
		System.out.println(errMsg);
		String actualresult = errMsg.getText();
		System.out.println(actualresult);

		String expectedResult = "This is a required field.";

		Assert.assertEquals(expectedResult, actualresult);
	}

}

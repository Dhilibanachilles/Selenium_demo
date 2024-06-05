package com.starAgile.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	
	public WebDriver driver;
	
	// xPath
	private By username = By.xpath("//input[@name = 'username']");
	private By password = By.xpath("//input[@name = 'password']");
	private By loginButton = By.xpath("//button[@type = 'submit']");
//	private By forgotPassword = By.linkText("Forgot your password? ");
	private By forgotPassword = By.xpath("//div[@class = 'orangehrm-login-forgot']");
	private By brandLogo = By.xpath("//div[@class = 'orangehrm-login-branding']");
	
	// invoke browser method
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dhili\\Documents\\Drivers_Selenium\\chromedriver-win64\\chromedriver.exe");
		// open the Chrome browser
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
	}
	
	// functions
	public void login() throws InterruptedException {
		driver.findElement(username).clear();
		driver.findElement(username).sendKeys("Admin");
		Thread.sleep(2000);
		
		driver.findElement(password).clear();
		driver.findElement(password).sendKeys("admin123");
		Thread.sleep(2000);
		
		driver.findElement(loginButton).click();
	}
	
	public void verifyLogo() {
		driver.findElement(brandLogo).isDisplayed();
	}
	
	public void verifyForgotPassword() {
		driver.findElement(forgotPassword).click();;
	}

}

package com.starAgile.testng;

import org.testng.annotations.Test;

import com.starAgile.Selenium.LoginPage;

public class LoginTest {
	
	LoginPage lp = new LoginPage();
	
	/*
	 * @BeforeMethod public void setUp() throws InterruptedException {
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\Users\\dhili\\Documents\\Drivers_Selenium\\chromedriver-win64\\chromedriver.exe"
	 * ); // open the Chrome browser WebDriver driver = new ChromeDriver();
	 * driver.manage().window().maximize(); driver.get(
	 * "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 * Thread.sleep(5000); }
	 */
	
	@Test
	public void login() throws InterruptedException {
		lp.setUp();
		lp.login();
	}
	
	@Test
	public void verifyLogo() throws InterruptedException {
		lp.setUp();
		lp.verifyLogo();
	}
	
	@Test
	public void verifyForgotPassword() throws InterruptedException {
		lp.setUp();
		lp.verifyForgotPassword();
	}

}

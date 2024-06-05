package com.starAgile.moduleThree;

import org.testng.annotations.Test;

import com.starAgile.Selenium.LoginPage;

public class LoginTest {
	
	LoginPage lp = new LoginPage();
	
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

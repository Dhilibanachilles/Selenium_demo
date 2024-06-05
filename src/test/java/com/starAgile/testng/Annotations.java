package com.starAgile.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations {
	
	@Test
	public void testCase1() {
		System.out.println("TestCase1 executed");
	}
	
	@Test
	public void testCase2() {
		System.out.println("TestCase2 executed");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Launching of browser");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("DB connection open");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("Closing the browser");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("DB connection closed");
	}

}

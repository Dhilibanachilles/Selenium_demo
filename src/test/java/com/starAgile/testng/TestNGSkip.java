package com.starAgile.testng;

import org.testng.annotations.Test;

public class TestNGSkip {
	
	@Test(priority = 0)
	public void testCase1() {
		System.out.println("TestCase1 Executed");
	}
	
	@Test(priority = 3, enabled = false)
	public void testCase2() {
		System.out.println("TestCase2 Executed");
	}
	
	@Test(priority = 2)
	public void testCase3() {
		System.out.println("TestCase3 Executed");
	}
	
	@Test(priority = 1)
	public void testCase4() {
		System.out.println("TestCase4 Executed");
	}

}

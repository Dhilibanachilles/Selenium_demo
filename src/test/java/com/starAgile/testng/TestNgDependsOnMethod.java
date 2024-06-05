package com.starAgile.testng;

import org.testng.annotations.Test;

public class TestNgDependsOnMethod {
	
//	@Test(enabled = false)
	@Test
	public void dBConnection() {
		System.out.println("Connected to Database");
	}
	
	@Test(dependsOnMethods = "dBConnection")
	public void query() {
		System.out.println("Query Execution");
	}

}

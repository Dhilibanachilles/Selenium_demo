package com.starAgile.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablesData {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhili\\Documents\\Drivers_Selenium\\chromedriver.exe");
		// invoke the Chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/tables");
		
		List<WebElement> rowNo = driver.findElements(By.xpath("//table[@id = 'table1']/tbody/tr"));
		int rowSize = rowNo.size();
		System.out.println(rowSize);
		
		List<WebElement> colNo = driver.findElements(By.xpath("//table[@id = 'table1']/tbody/tr[1]/td"));
		int colSize = colNo.size();
		System.out.println(colSize);
		
		WebElement TableDataAll = driver.findElement(By.xpath("//table[@id = 'table1']/tbody/tr/td"));
		WebElement tableDataForSpecific = driver.findElement(By.xpath("//table[@id = 'table1']/tbody/tr[3]/td[2]"));
		String td = tableDataForSpecific.getText();
	//	String cellData = TableDataAll.getText();
		System.out.println(td);
	//	System.out.println(cellData);
		String expectedData = "Jason";
		
		if(td.contains(expectedData))
			System.out.println("The data matches");
		else
			System.out.println("The data doesn't match");
		
		Thread.sleep(2000);
		driver.close();
		
	}

}

package com.starAgile.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableCell {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhili\\Documents\\Drivers_Selenium\\chromedriver.exe");
		// invoke the Chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
		WebElement cellData = driver.findElement(By.xpath("//table[@id = 'countries']/tbody/tr[6]/td[2]"));
		String cellDat = cellData.getText();
		System.out.println(cellDat);

		Thread.sleep(5000);
		driver.close();

	}

}

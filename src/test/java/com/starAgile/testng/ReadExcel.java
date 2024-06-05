package com.starAgile.testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ReadExcel {

	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFCell cell;

	@Test
	public void fbLogin() throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dhili\\Documents\\Drivers_Selenium\\chromedriver-win64\\chromedriver.exe");
		// open the Chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login");

		// import excel from the file
		// open the work book
		// open sheet name
		// get row and column and iterate them to get cell values
		File src = new File("C:\\Users\\dhili\\eclipse-workspace-staragile\\Selenium\\TestData.xlsx");
		// loading the file
		FileInputStream fis = new FileInputStream(src);
		// loading work book
		workbook = new XSSFWorkbook(fis);
		// go to sheet at 0th index - this will pick sheet 1
		sheet = workbook.getSheetAt(0);

		for (int i = 1; i <= sheet.getLastRowNum(); i++) {
			// import data from cell to load username
			cell = sheet.getRow(i).getCell(0);
			driver.findElement(By.xpath("//input[@name = 'email']")).clear();
			driver.findElement(By.xpath("//input[@name = 'email']")).sendKeys(cell.getStringCellValue());
			System.out.println(sheet.getLastRowNum());

			// import data from cell to load password
			cell = sheet.getRow(i).getCell(1);
			driver.findElement(By.xpath("//input[@name = 'pass']")).clear();
			driver.findElement(By.xpath("//input[@name = 'pass']")).sendKeys(cell.getStringCellValue());

			// writing operation
			String title = driver.getTitle();
			System.out.println(title);

			// write the above title to excel sheet

			FileOutputStream fos = new FileOutputStream(src);
			sheet.getRow(i).createCell(2).setCellValue(title);
			workbook.write(fos);
		}
		// implicit wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// explicit wait
		//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		//	wait.until(ExpectedConditions.visibilityOf(""));
		//	Thread.sleep(15000);
			driver.close();

	}

}

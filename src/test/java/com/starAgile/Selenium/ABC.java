package com.starAgile.Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ABC {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dhili\\Documents\\Drivers_Selenium\\chromedriver.exe");
		// invoke the Chrome browser
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://staragile.melimu.com/login/index.php");
		Thread.sleep(2000);		

		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("dhiliban.baskar@gmail.com");

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Agile@312");

		WebElement loginButton = driver.findElement(By.id("loginbtn"));
		loginButton.click();
		Thread.sleep(2000);
		
	//	WebElement startedNavigation = driver.findElement(By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='page-content']/div[@id='region-main-box']/section[@id='region-main']/div[@id='yui_3_17_2_1_1715096447682_24']/div[@id='yui_3_17_2_1_1715096447682_23']/ul[@id='yui_3_17_2_1_1715096447682_22']/li[2]/a[1]"));
		WebElement startedNavigation = driver.findElement(By.xpath("//a[@href = '#started']"));
	//	System.out.println(startedNavigation.isDisplayed());
		startedNavigation.click();
		Thread.sleep(2000);
		
	//	WebElement resumeNavigation = driver.findElement(By.xpath("//a[@class = 'btn btn-block btn-primary btn-sm m3-course-card-btn-view']"));
	//	System.out.println(resumeNavigation.isDisplayed());
	//	WebElement resumeNavigation = driver.findElement(By.xpath("(//a[@href='https://staragile.melimu.com/course/view.php?id=399' ])[1]"));
		WebElement resumeNavigation = driver.findElement(By.linkText("Automation SA2402019"));
		wait.until(ExpectedConditions.elementToBeClickable(resumeNavigation));
		resumeNavigation.click();
		Thread.sleep(2000);
		
		WebElement phaseOneNavigation = driver.findElement(By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='page-content']/div[@id='region-main-box']/section[@id='region-main']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]"));
	//	System.out.println(phaseOneNavigation.isDisplayed());
		if(phaseOneNavigation.isDisplayed())
			phaseOneNavigation.click();
		Thread.sleep(10000);
		driver.close();
		
	}

}

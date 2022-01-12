package com.bridgelabz.keywordmain;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.bridgelabz.utility.Utility;

public class ActionKeyword {
	public static WebDriver driver;

	public void openBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\OneDrive\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public void navigate() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Utility.URL);
	}
	
	
	public void fullName() {
		driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys(Utility.fullName);
	}
	
	public void enterMobileNumber() {
		driver.findElement(By.xpath("//input[@id='ap_phone_number']")).sendKeys(Utility.MobileNumber);
	}

	public void enterEmail() {
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys(Utility.email);
	}
	
//	public void clickContinue() {
//		driver.findElement(By.xpath("//input[@id='continue']")).click();
//	}

	public void enterPassword() {
		driver.findElement(By.name("password")).sendKeys(Utility.password);
	}

	public void clickContinue() {
		driver.findElement(By.xpath("//input[@id='continue']")).click();
	}



//	public void closeBrowser() {
//		driver.quit();
//	}

}

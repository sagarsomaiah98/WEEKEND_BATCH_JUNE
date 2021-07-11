package com.janbask.sauceDemo;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sauce_login {
	

	@Test
	public void login() throws InterruptedException {
		
		  System.setProperty("webdriver.chrome.driver", "D:\\JARS\\jar_files\\chromedriver\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
			
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS); //wait for the element for max 30 seconds
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(" //input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		String expected_value=driver.findElement(By.xpath("//span[contains(text(),'Products')]")).getText();
		
		System.out.println(expected_value);
		
		assertEquals(expected_value, "PRODUCTS");
		
		Thread.sleep(3000);
		driver.close();
		
		
	}
	

}

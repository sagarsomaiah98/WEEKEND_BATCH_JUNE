package com.janbask.sauceDemo;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sauce_AddToCart {
	@Test
	public void AddtoCart() throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "D:\\JARS\\jar_files\\chromedriver\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
			
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS); //wait for the element for max 30 seconds
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(" //input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
	String expected_value=	driver.findElement(By.xpath("//div[@class='inventory_item_name']")).getText();
	Thread.sleep(3000);
	System.out.println(expected_value);
	assertEquals(expected_value, "Sauce Labs Backpack");
	driver.close();
		
		
		
	}

}

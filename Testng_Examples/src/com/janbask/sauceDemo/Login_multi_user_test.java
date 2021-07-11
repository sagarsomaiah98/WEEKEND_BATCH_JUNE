package com.janbask.sauceDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login_multi_user_test {
	
	@Test(dataProvider = "sauce_users")
	public void login(String uname, String pwd) throws InterruptedException {
		

		  System.setProperty("webdriver.chrome.driver", "D:\\JARS\\jar_files\\chromedriver\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
			
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS); //wait for the element for max 30 seconds
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(" //input[@id='user-name']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
		driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
		Thread.sleep(3000);
		
	}
	
	
	  @DataProvider
	  public Object[][] sauce_users() {
		                          // rows cols(paramaters)   
		  Object[][] getdata= new Object[4][2];
		  getdata[0][0]="standard_user";
		  getdata[0][1]="secret_sauce";
		  
		  //second row
		  getdata[1][0]="performance_glitch_user";
		  getdata[1][1]="secret_sauce";
		  
		  //third row
		  getdata[2][0]="problem_user";
		  getdata[2][1]="secret_sauce";
		  
		  //fourth row
		  getdata[3][0]="locked_out_user";
		  
		  getdata[3][1]="secret_sauce";
		  return getdata;
	  }

}

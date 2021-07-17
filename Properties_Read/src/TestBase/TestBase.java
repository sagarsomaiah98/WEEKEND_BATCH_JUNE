package TestBase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import CONFIG.Read_properties;

public class TestBase {
	
	public static WebDriver driver;
	
	
	

	public static void main(String[] args) throws IOException {
		
		
		String bname=Read_properties.browser();
		String url =Read_properties.url();
		
		if(bname.equals("chrome")) {
       System.setProperty("webdriver.chrome.driver","D:\\JARS\\jar_files\\chromedriver\\chromedriver.exe");
       
      driver= new ChromeDriver();
      
      driver.manage().window().maximize();
      driver.get(url);
      
		}
		
		else if(bname.equals("firefox")) {
		 
		 System.setProperty("webdriver.gecko.driver","D:\\JARS\\jar_files\\geckodriver\\geckodriver.exe");
		
		driver= new FirefoxDriver();
		 driver.manage().window().maximize();
		driver.get(url);
		
		}
		
		else if(bname.equals("edge")) {
			 
			 System.setProperty("webdriver.edge.driver","D:\\JARS\\jar_files\\geckodriver\\edgedriver.exe");
			
			driver= new EdgeDriver();
			 driver.manage().window().maximize();
			driver.get(url);
			
			}
		
	}

}

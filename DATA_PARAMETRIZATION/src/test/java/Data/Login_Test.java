package Data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Xls_Reader xls= new Xls_Reader("D:\\JANBASK\\WEEKEND_WORKSPACE_BATCH1\\DATA_PARAMETRIZATION\\src\\main\\java\\TestData\\TESTSUITE.xlsx");
		int total_Rows=xls.getRowCount("SAUCE");
		System.out.println(total_Rows);
		
		
		  System.setProperty("webdriver.chrome.driver",
				  "D:\\JARS\\jar_files\\chromedriver\\chromedriver.exe"); 
			/*
			 * WebDriver driver = new ChromeDriver();
			 * 
			 * 
			 * driver.get("https://www.saucedemo.com/");
			 * driver.manage().window().maximize();
			 * 
			 * driver.findElement(By.id("user-name")).sendKeys("standar");
			 * driver.findElement(By.id("password")).sendKeys("sed");
			 * driver.findElement(By.name("login-button")).click();
			 */
	}

}

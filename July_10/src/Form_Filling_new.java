import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form_Filling_new {
	static WebDriver driver;
	
	public static void type(String xpath,String input_Value) {
		
		driver.findElement(By.xpath(xpath)).sendKeys(input_Value);
		
	}
	
	
public static  String uname() {
		
		int leftLimit = 97; // letter 'a'
	    int rightLimit = 122; // letter 'z'
	    int targetStringLength = 7;
	    Random random = new Random();

	    String generatedString = random.ints(leftLimit, rightLimit + 1)
	      .limit(targetStringLength)
	      .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
	      .toString();

	    
	    return generatedString;
	   // System.out.println(generatedString);

		
	}

	public static void main(String[] args) throws InterruptedException {
		
		  System.setProperty("webdriver.chrome.driver","D:\\JARS\\jar_files\\chromedriver\\chromedriver.exe"); // set the chrome driver
			
			driver= new ChromeDriver();
			driver.get("https://parabank.parasoft.com/parabank/register.htm");
			driver.manage().window().maximize();
			
			type("//input[@id='customer.firstName']","John");
		
	        type("//input[@id='customer.lastName']","wat");
	        type("//input[@id='customer.address.street']","24 street nsw");
	        type("//input[@id='customer.address.city']","London");
	        type(" //input[@id='customer.address.state']","NSW");
	        type("//input[@id='customer.address.zipCode']","2148");
	        type("//input[@id='customer.phoneNumber']","04123456");
	        type(" //input[@id='customer.ssn']","56321");
	        type("//input[@id='customer.username']","John"+uname());
	        type("//input[@id='customer.password']","123456");
	        type("//input[@id='repeatedPassword']","123456");
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//input[@value='Register']")).click();
	        Thread.sleep(3000);	
	        
	        
		
	
	
		
		

	}

}

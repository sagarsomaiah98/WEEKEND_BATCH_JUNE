import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Orange_Login {

	public static void main(String[] args) {
		
      System.setProperty("webdriver.chrome.driver", "D:\\JARS\\jar_files\\chromedriver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver(); //launch the browser
		 
		driver.manage().window().maximize(); // maximize the browser
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		//     //input[@id='txtUsername'] - username
		
		//     //input[@id='txtPassword']   - password
		
		//      //input[@id='btnLogin']    -login
		
		//Step1 : enter the username
		//step 2: enter the password
		
	//Step 3: click login
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin"); //enter username
		driver.findElement(By.xpath("//input[@id='txtPassword'] ")).sendKeys("admin123"); //enter password
		driver.findElement(By.xpath("//input[@id='btnLogin'] ")).click(); //click login
		String msg =driver.findElement(By.xpath(" //span[@id='spanMessage']")).getText();
		
		System.out.println(msg);
         driver.close();
	}

}



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Different_Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//https://github.com/mozilla/geckodriver/releases
		
		
		System.setProperty("webdriver.gecko.driver","D:\\JARS\\jar_files\\geckodriver\\geckodriver.exe");
		WebDriver driver1= new FirefoxDriver();
		
		
		System.setProperty("webdriver.chrome.driver","D:\\JARS\\jar_files\\chromedriver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
	

	}

}

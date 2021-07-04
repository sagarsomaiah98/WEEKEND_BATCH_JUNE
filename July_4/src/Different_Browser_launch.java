import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Different_Browser_launch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\JARS\\jar_files\\chromedriver\\chromedriver.exe");
		
		//	WebDriver driver= new ChromeDriver();
			
			System.setProperty("webdriver.gecko.driver", "D:\\JARS\\jar_files\\geckodriver\\geckodriver.exe");
			
			
			WebDriver driver1 = new FirefoxDriver();
			
			WebDriver driver2 = new EdgeDriver();
			
			WebDriver driver3 = new SafariDriver();
	}

}

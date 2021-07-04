import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Properties {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\JARS\\jar_files\\chromedriver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.get("https://www.google.com");
		//driver.navigate().to("https://www.bing.com");
		
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		driver.get("https://www.bing.com");
		Thread.sleep(3000);
		
		
		driver.close();
			

	}

}

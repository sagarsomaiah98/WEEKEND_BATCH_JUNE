import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebEle {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "D:\\JARS\\jar_files\\chromedriver\\chromedriver.exe");
		
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.testandquiz.com/selenium/testing.html");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	driver.findElement(By.linkText("This is a link")).click();
	driver.navigate().back();
	
	driver.findElement(By.id("fname")).sendKeys("sampleinput");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@id='idOfButton']")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("female")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@value='Performance']")).click();
	Thread.sleep(3000);

	}

}

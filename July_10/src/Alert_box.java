import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_box {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.chrome.driver", "D:\\JARS\\jar_files\\chromedriver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
	driver.get("https://www.testandquiz.com/selenium/testing.html");
	
	driver.manage().window().maximize();
	
	
	driver.findElement(By.xpath("//button[contains(text(),'Generate Alert Box')]")).click();
	Thread.sleep(3000);
	
	Alert al= driver.switchTo().alert();
	Thread.sleep(3000);
	//al.accept(); //click ok
	al.dismiss(); //click cancel
		
		

	}

}

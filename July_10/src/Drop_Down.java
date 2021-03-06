import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Drop_Down  {
	
	
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "D:\\JARS\\jar_files\\chromedriver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		WebElement dropdowns= driver.findElement(By.xpath("//select[@id='testingDropdown']"));
		System.out.println(" got elements");
		Select sel = new Select(dropdowns);
		sel.selectByIndex(2);
		
		
		System.out.println(" selected 2");
		Thread.sleep(3000);
		sel.selectByValue("Database");
		Thread.sleep(3000);
		sel.selectByVisibleText("Automation Testing");
		Thread.sleep(3000);
		
		
		
	}

}

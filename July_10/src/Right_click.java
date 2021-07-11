

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_click {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","D:\\JARS\\jar_files\\chromedriver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		
	
		
		driver.get("https://demoqa.com/buttons");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement ele=driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
	//	WebElement check=driver.findElement(By.xpath("//span[contains(text(),'Check Box')]"));
		
		Actions action= new Actions(driver);
		action.contextClick(ele).perform();
		Thread.sleep(3000);
		
		//WebElement ele1=driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		
		//action.doubleClick(ele1).perform();
		
		
		System.out.println("done");

	}

}

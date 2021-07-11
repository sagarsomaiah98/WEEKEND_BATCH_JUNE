import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_Handling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","D:\\JARS\\jar_files\\chromedriver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		
		driver.get("https://login.salesforce.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='privacy-link']")).click();
		//driver.findElement(By.xpath("//a[@id='privacy-link']")).click();
		
		
		Thread.sleep(3000);
		Set<String> windows= driver.getWindowHandles();
		
		System.out.println("Size of windows  == "+windows.size());
		
		Iterator<String> it = windows.iterator();
		
		/*
		 * System.out.println(it.next()); System.out.println(it.next());
		 * System.out.println(it.next());
		 */
		
		String main=it.next();
		String child=it.next();
		
		driver.switchTo().window(child);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Learn more')]")).click();
		
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
		/*
		 * Iterator<String> it = windows.iterator();
		 * 
		 * String parent= it.next(); String child= it.next();
		 * 
		 * System.out.println("Parent window --> "+parent);
		 * System.out.println("child  window --> "+child);
		 * 
		 * // driver.switchTo().window(child);
		 * 
		 * Thread.sleep(3000); driver.findElement(By.linkText("Our Story")).click();
		 * Thread.sleep(3000); driver.close();
		 */

	}

}

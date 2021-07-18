package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_StepDefinition {
	
	WebDriver driver;
	@Given("^Chrome browser is launched$")
	public void chrome_browser_is_launched() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "");
	  driver = new ChromeDriver();
	}

	@Given("^I enter the url of the application$")
	public void i_enter_the_url_of_the_application() throws Throwable {
	    System.out.println("entered url");
	    
	    driver.get("http://oranghrm.com");
	}

	@When("^I enter the username and password$")
	public void i_enter_the_username_and_password() throws Throwable {
	    System.out.println("entered username and password");
	}

	@When("^I click submit$")
	public void i_click_submit() throws Throwable {
	   System.out.println("clicked submit");
	}

	@Then("^I logged in successfully$")
	public void i_logged_in_successfully() throws Throwable {
	    System.out.println("logged successfully");
	    
	    System.out.println("********************************************************");
	}

	
	
	@Given("^I enter the url \"([^\"]*)\" of the application$")
	public void i_enter_the_url_of_the_application(String arg1) throws Throwable {
	    System.out.println("enter the url = "+arg1);
	}

	@When("^I enter the username \"([^\"]*)\"  and password \"([^\"]*)\"$")
	public void i_enter_the_username_and_password(String arg1, String arg2) throws Throwable {
System.out.println("enter the username  =  "+arg1+"  enter the password = "+arg2  );
	}


}

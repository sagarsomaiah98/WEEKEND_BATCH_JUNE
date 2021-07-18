package StepDefiniton;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MultiLogin_StepDefinition {
	
	@Given("^Launch the browser$")
	public void launch_the_browser() throws Throwable {
	   System.out.println("launched browser");
	}

	@Given("^I enter the url$")
	public void i_enter_the_url() throws Throwable {
	  System.out.println("entered url");
	}

	@When("^I enter the username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void i_enter_the_username_and_password(String arg1, String arg2) throws Throwable {
	    System.out.println("entered username   "+arg1);
	    System.out.println("entered password   "+arg2);
	}

	@When("^I clicked submit$")
	public void i_clicked_submit() throws Throwable {
		System.out.println("clicked submit");
	  
	}

	@Then("^I logged in successfully$")
	public void i_logged_in_successfully() throws Throwable {
		System.out.println("logged successfully");
	   
	}


}

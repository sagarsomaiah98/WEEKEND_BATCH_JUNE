package StepDefiniton;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_StepDefinition {
	
	@Given("^server is running$")
	public void server_is_running() throws Throwable {
	    System.out.println(" server is running");
	}

	@Given("^I username and password is created$")
	public void i_username_and_password_is_created() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		  System.out.println(" entered the password ");
	}

	@Given("^Enter the \"([^\"]*)\" of the application$")
	public void enter_the_of_the_application(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		  System.out.println(" enter url of application ");
	   
	}

	@When("^Enter the username \"([^\"]*)\"$")
	public void enter_the_username(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		  System.out.println(" entered username "+arg1);
	    
	}

	@When("^Enter the  password \"([^\"]*)\"$")
	public void enter_the_password(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		  System.out.println(" entered password "+arg1);
	  
	}

	@When("^Click Submit$")
	public void click_Submit() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		  System.out.println(" clicked submit");
	  
	}
	@Then("^Login Successful$")
	public void login_Successful() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		  System.out.println(" Login success");
	}


}

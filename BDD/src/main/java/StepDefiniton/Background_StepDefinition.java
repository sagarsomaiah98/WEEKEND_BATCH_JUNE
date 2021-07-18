package StepDefiniton;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Background_StepDefinition {
	
	
	@When("^I enter to address$")
	public void i_enter_to_address() throws Throwable {
	  System.out.println("enter address");
	}

	@When("^I enter subject$")
	public void i_enter_subject() throws Throwable {
	   System.out.println("enter subject");
	}

	@When("^I enter body$")
	public void i_enter_body() throws Throwable {
	  System.out.println("enter body");
	}

	@Then("^I click send$")
	public void i_click_send() throws Throwable {
	   System.out.println("click send");
	}

	@Then("^I click save$")
	public void i_click_save() throws Throwable {
	   System.out.println("click save");
	}


}

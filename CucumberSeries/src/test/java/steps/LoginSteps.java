package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("user navigates to the facebook website")
	public void user_navigates_to_the_facebook_website() {

	}

	@When("user validates the home page title")
	public void user_validates_the_home_page_title() {

	}

	@Then("user enters {string} username")
	public void user_enters_username(String username) {
		System.out.println(username);		
	}

	@And("user enters {string} password")
	public void user_enters_password(String password) {
		System.out.println(password);	
	}

	@And("user clicks on signin button")
	public void user_clicks_on_signin_button() {

	}
}

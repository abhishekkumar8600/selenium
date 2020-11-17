package stepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class StepDefinition {

	    @Given("^User is on netbanking login page$")
	    public void user_is_on_netbanking_login_page() throws Throwable {
	       System.out.println("login page");
	    }

	    @When("^user login using pwd \"([^\"]*)\" and username \"([^\"]*)\"$")
	    public void user_login_using_pwd_something_and_username_something(String password, String username) throws Throwable {
	        System.out.println(password);
	        System.out.println(username);
	    }


	    @Then("^Home is populated$")
	    public void home_is_populated() throws Throwable {
	        System.out.println("populated");
	    }

	    @And("^cards are displayed$")
	    public void cards_are_displayed() throws Throwable {
	        System.out.println("displayed");
	    }
}

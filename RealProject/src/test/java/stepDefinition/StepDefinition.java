package stepDefinition;

import java.io.IOException;

import org.junit.runner.RunWith;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.LandingPage;
import pageObject.LoginPage;
import resources.Base;

public class StepDefinition extends Base {
		@Given("initialize the driver")
		public void initialize_the_driver() throws IOException  {
		    // Write code here that turns the phrase above into concrete actions
			driver=initializedriver();
		}


	

		@Given("access {string}")
		public void access(String string) {
		    // Write code here that turns the phrase above into concrete actions
			
			driver.get(string);
		}
		@Given("click on login link")
		public void click_on_login_link() {
		    // Write code here that turns the phrase above into concrete actions
			
			LandingPage lp=new LandingPage(driver);
			lp.login().click();
		}
		
		
		 @When("^enter username \"([^\"]*)\" and pwd \"([^\"]*)\"$")
		    public void enter_username_something_and_pwd_something(String user, String pwd) throws Throwable {
			 LoginPage l=new LoginPage(driver);
				l.getEmail().sendKeys(user);
				l.getPwd().sendKeys(pwd);
				l.getLogin().click();
		    }
		 
	



}

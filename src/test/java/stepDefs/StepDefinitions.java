package stepDefs;

import implementation.Implementation;
import io.cucumber.java.en.*;

public class StepDefinitions extends Implementation{
	
	@Given("User launches the {string}")
	public void user_launches_the(String Browser) {
	    launchBrowser(Browser);
	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String UserName, String Password) {
	    enterCredentials(UserName, Password);
	}

	@Then("User clicks on Login button")
	public void user_clicks_on_login_button() {
	    clicksLoginButton();
	}

	@Then("User views the Dashboard")
	public void user_views_the_dashboard() {
	    viewDashboard();
	}


}

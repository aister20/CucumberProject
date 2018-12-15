package stepDefinitions;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.sun.tools.javac.util.List;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignUpSteps extends BaseClass {
	
	@Given("^I open browser$")
	public void i_open_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^I navigate to the FreeCrm$")
	public void i_navigate_to_the_FreeCrm() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^I click oon SignUo$")
	public void i_click_oon_SignUo() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I enter <firstName> and <lastName> and <email>$")
	public void i_enter_firstName_and_lastName_and_email() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I enter credentials <userName> and <password>$")
	public void i_enter_credentials_userName_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I check conditions and click submit$")
	public void i_check_conditions_and_click_submit() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I enter company information <company> and <phone>$")
	public void i_enter_company_information_company_and_phone() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I click on continue$")
	public void i_click_on_continue() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I click on complete Registration$")
	public void i_click_on_complete_Registration() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I provide the following details$")
	public void i_provide_the_following_details(DataTable arg1)  {
	    List<Map<String,String>> maps = signDetails.asMaps(String.class, String.class);
	    throw new PendingException();
	}



}

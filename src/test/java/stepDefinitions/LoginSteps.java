package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;



import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import testUtils.BaseClass;

public class LoginSteps extends BaseClass {

	@Given("^I open browser$")
	public void i_open_browser()  {
	   System.out.println("I open browser");
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\selenium-java-3.14.0\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@Given("^I navigate to the FreeCrm$")
	public void i_navigate_to_the_FreeCrm()  {
		driver.get("https://www.freecrm.com/index.html");
	 
	}

	@When("^I enter valid username and password$")
	public void i_enter_valid_username_and_password()  {
	    driver.findElement(By.name("username")).sendKeys("aister20");
	    driver.findElement(By.name("password")).sendKeys("Andreco20");
	
	}

	@When("^I click login button$")
	public void i_click_login_button()  {
	   driver.findElement(By.className("btn btn-small")).click();
	   
	}

	@Then("^I succesfully logged in$")
	public void i_succesfully_logged_in() {
	   System.out.println("Succesfully logged in");
	  
	}
	
	@When("^I enter invalid username and password$")
	public void i_enter_invalid_username_and_password() {
	   System.out.println("Enteres invalid usenrmae and pass");

	}

	@Then("^I see error message$")
	public void i_see_error_message() {
	        System.out.println("I see error message");
	 
	
	}




}

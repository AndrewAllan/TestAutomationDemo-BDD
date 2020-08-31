package steps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import Browsers.Chrome;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.login;

public class LoginSteps {
	WebDriver driver;
	login login;
	
	@Given("^I am on the login screen$")
	public void i_am_on_the_login_screen() throws Throwable {
		Chrome chrome = new Chrome();
		driver = chrome.StartChromeDriver("https://www.phptravels.net/login");
	}

	@Given("^I enter my username$")
	public void i_enter_my_username() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		login = new login(driver);
	    login.weEmail.sendKeys("user@phptravels.com");
	}

	@Given("^I enter my password$")
	public void i_enter_my_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   login = new login(driver);
	   login.wePassword.sendKeys("demouser");
	}

	@When("^I press the submit button$")
	public void i_press_the_submit_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		login = new login(driver);
	    login.weLogin.click();
	}

	@Then("^I am navigated to the account page$")
	public void i_am_navigated_to_the_account_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals("https://www.phptravels.net/account/",driver.getCurrentUrl());	
	}

	@Then("^a validation email validation message is displayed$")
	public void a_validation_email_validation_message_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		login = new login(driver);
		assertEquals("Please fill in this field.",login.weEmail.getAttribute("validationMessage"));
	}

	@Then("^a validation password validation message is displayed$")
	public void a_validation_password_validation_message_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		login = new login(driver);
		assertEquals("Please fill in this field.",login.wePassword.getAttribute("validationMessage"));
	}
	
}
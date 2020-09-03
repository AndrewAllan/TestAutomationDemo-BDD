package steps;

import static org.junit.Assert.assertEquals;

import org.apache.log4j.Logger;

import Browsers.Chrome;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.login;
import Utils.base;

public class LoginSteps extends base{
	login login;
	static Logger log = Logger.getLogger(LoginSteps.class.getName());
	@Given("^I am on the login screen$")
	public void i_am_on_the_login_screen() throws Throwable {
		Chrome chrome = new Chrome();
		driver = chrome.StartChromeDriver("https://www.phptravels.net/login");
		login = new login(driver);
		log.info("starting webdriver");
	}

	@Given("^I enter my username$")
	public void i_enter_my_username() throws Throwable {
		log.info("Entering email address");
		login.weEmail.sendKeys("user@phptravels.com");
	   // log.info("Entering email address");
	}

	@Given("^I enter my password$")
	public void i_enter_my_password() throws Throwable {
		log.info("Entering password");
		login.wePassword.sendKeys("demouser");
	}

	@When("^I press the submit button$")
	public void i_press_the_submit_button() throws Throwable {
	   log.info("pressing the submit button");
		login.weLogin.click();
	}

	@Then("^I am navigated to the account page$")
	public void i_am_navigated_to_the_account_page() throws Throwable {
		log.info("asserting the user is on the account page");
		assertEquals("https://www.phptravels.net/account/",driver.getCurrentUrl());	
	}

	@Then("^a validation email validation message is displayed$")
	public void a_validation_email_validation_message_is_displayed() throws Throwable {
		log.info("asserting the user email validation is shown to the user");
		assertEquals("Please fill in this field.",login.weEmail.getAttribute("validationMessage"));
	}

	@Then("^a validation password validation message is displayed$")
	public void a_validation_password_validation_message_is_displayed() throws Throwable {
		log.info("asserting the user password validation is shown to the user");
		assertEquals("Please fill in this field.",login.wePassword.getAttribute("validationMessage"));
	}	
}

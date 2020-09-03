package steps;

import static org.junit.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import Browsers.Chrome;
import Utils.base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.SignUp;

public class SignUpSteps extends base {
	//WebDriver driver;
	SignUp signup;
	static Logger log = Logger.getLogger(LoginSteps.class.getName());
	
	
	@Given("^I am on the sign in page$")
	public void i_am_on_the_sign_in_page() throws Throwable {
		log.info("starting webdriver and oppening webpage");
		Chrome chrome = new Chrome();
		driver = chrome.StartChromeDriver("https://www.phptravels.net/register");
		signup = new SignUp(driver);
	}

	@Given("^I enter my lastname$")
	public void i_enter_my_lastname() throws Throwable {
		log.info("entering name into the last name text box");
		signup.weLastname.sendKeys("bobby");
	}

	@Given("^I enter my mobile number$")
	public void i_enter_my_mobile_number() throws Throwable {
		log.info("entering phone number into the phone number text box");
		signup.wePhone.sendKeys("07712566521");	
	}

	@Given("^I enter my email address$")
	public void i_enter_my_email_address() throws Throwable {
		log.info("enter email into the email address box");
		signup.weEmail.sendKeys("asd@asd.com");	
	}

	@Given("^I enter my confirm password$")
	public void i_enter_my_confirm_password() throws Throwable {
		log.info("entering password into the password confirmation box");
		signup.weConfirmPassword.sendKeys("abc123");
	}
	
	@Given("^I enter my new password$")
	public void i_enter_my_mew_password() throws Throwable {
		log.info("entering password into the password box");
		signup.wePassword.sendKeys("abc123");
	}

	@When("^I press submit$")
	public void i_press_submit() throws Throwable {
		log.info("pressing the submit button");
		signup.weSignUp.click();
		Thread.sleep(2000);
	}

	@Then("^I am displayed a forename validation message$")
	public void i_am_displayed_a_forename_validation_message() throws Throwable {
		log.info("asserting the forename validation is pressent");
		assertEquals("Please fill in this field.",signup.weFirstname.getAttribute("validationMessage"));
	}

	@Given("^I enter my forename address$")
	public void i_enter_my_forename_address() throws Throwable {
		log.info("asserting the forename validation is pressent");
		assertEquals("Please fill in this field.",signup.weFirstname.getAttribute("validationMessage"));
	}

	@Then("^I am displayed a email validation message$")
	public void i_am_displayed_a_email_validation_message() throws Throwable {
		log.info("asserting the email validation is pressent");
		assertEquals("Please fill in this field.",signup.weEmail.getAttribute("validationMessage"));

	}

	@Then("^I am displayed a lastname validation message$")
	public void i_am_displayed_a_lastname_validation_message() throws Throwable {
		log.info("asserting the lastname validation is pressent");
		assertEquals("Please fill in this field.",signup.weLastname.getAttribute("validationMessage"));
	}

	@Given("^I enter my forename$")
	public void i_enter_my_forename() throws Throwable {
		log.info("asserting the forename validation is pressent");
		signup.weFirstname.sendKeys("bobby");
	}

	@Then("^I am displayed a mobile number validation message$")
	public void i_am_displayed_a_mobile_number_validation_message() throws Throwable {
		log.info("asserting the mobile number validation is pressent");
		assertEquals("Please fill in this field.",signup.wePhone.getAttribute("validationMessage"));
	}

	@Then("^I am displayed a password validation message$")
	public void i_am_displayed_a_password_validation_message() throws Throwable {
		log.info("asserting the password validation is pressent");
		assertEquals("Please fill in this field.",signup.wePassword.getAttribute("validationMessage"));
	}

	@Then("^I am displayed a confirm passowrd validation message$")
	public void i_am_displayed_a_confirm_passowrd_validation_message() throws Throwable {
		log.info("asserting the confirm password validation is pressent");
		assertEquals("Please fill in this field.",signup.weConfirmPassword.getAttribute("validationMessage"));
	}

	@Then("^I am redirected to the account screen$")
	public void i_am_redirected_to_the_account_screen() throws Throwable {
		Thread.sleep(2000);
		log.info("asserting the user has been redirected to the correct url");
		assertEquals(driver.getCurrentUrl(),"https://www.phptravels.net/account/");
	}

}

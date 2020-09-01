package steps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import Browsers.Chrome;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.SignUp;

public class SignUpSteps {
	WebDriver driver;
	SignUp signup;
	
	@Given("^I am on the sign in page$")
	public void i_am_on_the_sign_in_page() throws Throwable {
		Chrome chrome = new Chrome();
		driver = chrome.StartChromeDriver("https://www.phptravels.net/register");
		signup = new SignUp(driver);
	}

	@Given("^I enter my lastname$")
	public void i_enter_my_lastname() throws Throwable {
	//	signup = new SignUp(driver);
		signup.weLastname.sendKeys("bobby");
	}

	@Given("^I enter my mobile number$")
	public void i_enter_my_mobile_number() throws Throwable {
	//	signup = new SignUp(driver);
		signup.wePhone.sendKeys("07712566521");	
	}

	@Given("^I enter my email address$")
	public void i_enter_my_email_address() throws Throwable {
	//	signup = new SignUp(driver);
		signup.weEmail.sendKeys("asd@asd.com");	
	}

	@Given("^I enter my confirm password$")
	public void i_enter_my_confirm_password() throws Throwable {
		//signup = new SignUp(driver);
		signup.weConfirmPassword.sendKeys("asd@asd.com");
	}

	@When("^I press submit$")
	public void i_press_submit() throws Throwable {
		//signup = new SignUp(driver);
		signup.weConfirmPassword.click();
	}

	@Then("^I am displayed a forename validation message$")
	public void i_am_displayed_a_forename_validation_message() throws Throwable {
		//login = new login(driver);
		assertEquals("Please fill in this field.",signup.weFirstname.getAttribute("validationMessage"));

	}

	@Given("^I enter my forename address$")
	public void i_enter_my_forename_address() throws Throwable {
	//	assertEquals("Please fill in this field.",signup.weFirstname.getAttribute("validationMessage"));
	}

	@Then("^I am displayed a email validation message$")
	public void i_am_displayed_a_email_validation_message() throws Throwable {
		assertEquals("Please fill in this field.",signup.weEmail.getAttribute("validationMessage"));

	}

	@Then("^I am displayed a lastname validation message$")
	public void i_am_displayed_a_lastname_validation_message() throws Throwable {
		assertEquals("Please fill in this field.",signup.weLastname.getAttribute("validationMessage"));
	}

	@Given("^I enter my forename$")
	public void i_enter_my_forename() throws Throwable {
		signup.weFirstname.sendKeys("bobby");
	}

	@Then("^I am displayed a mobile number validation message$")
	public void i_am_displayed_a_mobile_number_validation_message() throws Throwable {
		assertEquals("Please fill in this field.",signup.wePhone.getAttribute("validationMessage"));
	}

	@Then("^I am displayed a password validation message$")
	public void i_am_displayed_a_password_validation_message() throws Throwable {
		assertEquals("Please fill in this field.",signup.wePassword.getAttribute("validationMessage"));
	}

	@Then("^I am displayed a confirm passowrd validation message$")
	public void i_am_displayed_a_confirm_passowrd_validation_message() throws Throwable {
		assertEquals("Please fill in this field.",signup.weConfirmPassword.getAttribute("validationMessage"));
	}

	@Then("^I am redirected to the account screen$")
	public void i_am_redirected_to_the_account_screen() throws Throwable {
		Thread.sleep(2000);
		assertEquals(driver.getCurrentUrl(),"https://www.phptravels.net/account/");
	}

}

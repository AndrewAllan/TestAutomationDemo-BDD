package steps;


import static org.junit.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import Browsers.Chrome;
import Utils.base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.Home;

public class CurrencySteps extends base {
	Home home;
	static Logger log = Logger.getLogger(LoginSteps.class.getName());

	
	@Given("^I am on the home page$")
	public void i_am_on_the_home_page() throws Throwable {
		// creating an instance of the chrome and home class 
		//sets the base driver to the returned webdriver from the Chrome class
		log.info("starting chrome webdriver on phptravel");
		Chrome chrome = new Chrome();
		driver = chrome.StartChromeDriver("https://www.phptravels.net");
		home = new Home(driver);
	}

	@Given("^I select euro from the currency dropdown$")
	public void i_select_euro_from_the_currency_dropdown() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		log.info("step to be added");
		home.weCurrencyDropDown.click();
		Thread.sleep(2000);
		home.weEuroOpt.click();
		Thread.sleep(2000);
	}

	@Then("^I am show prices in euros$")
	public void i_am_show_prices_in_euros() throws Throwable {
		//checks if there are elements with the text € uses the is empty function so should return false 
		log.info("step to be added");
		log.info("checking there are elements with the currency symbnol €");
		assertEquals(driver.findElements(By.xpath("//*[contains(text(),'€')]")).isEmpty(),false);
	
	}
	
	@Then("^The default currency selected is USD$")
	public void the_default_currency_selected_is_USD() throws Throwable {
	    // checks that USD is selected by default in the currency dropdown
		log.info("checking that the default currency is USD");
		assertEquals(home.weCurrencyDropDown.getText(),"USD");
	}

	@Then("^prices on the site are in USD$")
	public void prices_on_the_site_are_in_USD() throws Throwable {
		//checks if there are elements with the text $ uses the is empty function so should return false 
		log.info("checking there are elements with the currency symbnol $");
		assertEquals(driver.findElements(By.xpath("//*[contains(text(),'$')]")).isEmpty(),false);
	}
}

package steps;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.assertEquals;
import Browsers.Chrome;
import Utils.base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Home;

public class HotelSearchSteps extends base {
	//WebDriver driver;
	Home home;
	static Logger log = Logger.getLogger(LoginSteps.class.getName());

	@Test
	public void thisIsTest() {
		Home home = new Home(driver);
		home.search().myMethod();
	}

	@Given("^I am on the home page of phptravel$")
	public void i_am_on_the_home_page_of_phptravel() throws Throwable {
		log.info("oppening webdriver and oppening phptravel home");
		Chrome chrome = new Chrome();
		driver = chrome.StartChromeDriver("https://www.phptravels.net");
		home = new Home(driver);
	}

	@Given("^I select hotels from the search section$")
	public void i_select_hotels_from_the_search_section() throws Throwable {
		log.info("clicking the home menu option");
		home.search().weHotelsMnu.click();
		Thread.sleep(2000);
	}

	@When("^I enter a hotel name$")
	public void i_enter_a_hotel_name() throws Throwable {
		log.info("entering the destination");
		home.search().weDestination.click();
		Thread.sleep(2000);
		home.search().weMnuOptHotel.click();
	}

	@When("^I press the search button$")
	public void i_press_the_search_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		log.info("clicking the search button");
		home.search().weSearchButton.click();
		
	}

	@Then("^I am show the listing for the hotel$")
	public void i_am_show_the_listing_for_the_hotel() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// still to be added
		log.info("asserting that the correct hotel is displayed");
		assertEquals(driver.findElement(By.id("detail-content-sticky-nav-00")).getText(),"Oasis Beach Tower");
				
	}

	@When("^I enter a city name$")
	public void i_enter_a_city_name() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		log.info("entering a city into the destination text box");
		home.search().weDestination.click();
		Thread.sleep(2000);
		home.search().weMnuOptCity.click();
	}

	@Then("^I am shown hotel listings for the city$")
	public void i_am_shown_hotel_listings_for_the_city() throws Throwable {
		//quick check will move code once verified
		// still to be done
		log.info("asserting that listings are shown for the correct city");
		assertEquals(driver.findElement(By.xpath("//h3[@class='heading-title']//span[@class='text-primary']")).getText(),"London");
	}

	@When("^I enter the number of children$")
	public void i_enter_the_number_of_children() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		log.info("adding child to booking");
		home.search().weAddChildren.click();
	}

	@Given("^I enter a check in date$")
	public void i_enter_a_check_in_date() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// date picker need to remembver how it works
		log.info("entering checkin date");
		home.search().weCheckin.sendKeys("");
	}

	@Given("^I enter a check out date$")
	public void i_enter_a_check_out_date() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// date picker need to remembver how it works
		log.info("entering checkout date");
		home.search().weCheckout.sendKeys("");
	}

	@Given("^I enter the number of adults$")
	public void i_enter_the_number_of_adults() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		log.info("adding adult to booking");
		home.search().weAddAdults.click();
	}

	@Then("^I am shown validation for the description feild$")
	public void i_am_shown_validation_for_the_description_feild() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// needs to be done#
		log.info("still to be added validation on description feild");
	}

}

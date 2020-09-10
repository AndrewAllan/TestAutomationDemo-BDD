package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.HotelSearch;

public class Home {
	WebDriver driver;

	public Home(WebDriver driverIn) {
		driver = driverIn;
		PageFactory.initElements(driver, this);
	}
	
	//locator for the selected currency text in currency dropdown
	//*[@id="dropdownCurrency"]/span
	
	@FindBy(xpath ="//div[@class='dropdown dropdown-currency']/a")
	public WebElement weCurrencyDropDown;
	
	//*[contains(text(),'EUR')]
	@FindBy(xpath ="//*[contains(text(),'EUR')]")
	public WebElement weEuroOpt;
	
	public HotelSearch search() {
		HotelSearch search = new HotelSearch(driver);
		return search;
	}
}

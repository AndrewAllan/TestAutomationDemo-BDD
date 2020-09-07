package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.HotelSearch;

public class Home {
	WebDriver driver;

	public Home(WebDriver driverIn) {
		driver = driverIn;
		PageFactory.initElements(driver, this);
	}
	
	public HotelSearch search() {
		HotelSearch search = new HotelSearch(driver);
		return search;
	}
}

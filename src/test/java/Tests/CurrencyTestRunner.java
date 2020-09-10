package Tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import Browsers.Chrome;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import pages.Home;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/features/Currency.feature"},
				glue = {"steps"},
				monochrome=true
		)

public class CurrencyTestRunner {
/*	WebDriver driver;
	Home home;
	
	@Test
	public void test() {
		Chrome chrome = new Chrome();
		driver = chrome.StartChromeDriver("https://www.phptravels.net");
		home = new Home(driver);
		System.out.println(home.weCurrencyDropDown.getText());
		home.weCurrencyDropDown.click();
	}*/
}

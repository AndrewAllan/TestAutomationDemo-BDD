package Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
	public WebDriver StartChromeDriver(String urlIn){
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "src/test/java/WebDrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(urlIn);
		driver.manage().window().fullscreen();
		return driver;}
}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelSearch {

	WebDriver driver;

	public HotelSearch(WebDriver driverIn) {
		driver = driverIn;
		PageFactory.initElements(driver, this);
	}

	public void myMethod() {
		System.out.println("fdsfsd");
	}

	// WebElement for the Destination text feild
	// custom xpath used
	@FindBy(xpath = "//*[@id='s2id_autogen16']")
	public WebElement weDestination;

	// WebElement for the Destination text feild
	// custom xpath used
	@FindBy(xpath = "//*[@id='search']//a[@class='text-center hotels active']")
	public WebElement weHotelsMnu;
	// *[@id="search"]//a[@class='text-center hotels active']
	@FindBy(id = "checkin")
	public WebElement weCheckin;
	
	@FindBy(id = "checkout")
	public WebElement weCheckout;
	
	//worst fucking xpath i have seen in my life(comming back for you)
	@FindBy(xpath ="//*[@id=\"hotels\"]/div/div/form/div/div/div[3]/div/div/div/div/div/div/div[1]/div/div[2]/div/span/button[1]")
	public WebElement weAddAdults;
	
	//worst fucking xpath i have seen in my life(comming back for you)
	@FindBy(xpath ="//*[@id=\'hotels\']/div/div/form/div/div/div[3]/div/div/div/div/div/div/div[2]/div/div[2]/div/span/button[1]")
	public WebElement weAddChildren;
	
	//*[@id="hotels"]//button[contains(text(),'Search')]
	@FindBy(xpath ="//*[@id=\"hotels\"]//button[contains(text(),'Search')]")
	public WebElement weSearchButton;

	@FindBy(xpath = "//div[contains(text(),'London, United Kingdom')]")
	public WebElement weMnuOptCity;
	
	@FindBy(xpath = "//ul[@class='select2-result-sub']//div[text()='Oasis Beach Tower, Dubai']")
	public WebElement weMnuOptHotel;
	//ul[@class='select2-result-sub']//div[text()='Oasis Beach Tower, Dubai']
}

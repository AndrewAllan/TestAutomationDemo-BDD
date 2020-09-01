package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import Utils.base;

public class Hooks extends base {
	@Before
	public void beforeTest() {
		System.out.println("this is the before hook");		
	}
	
	@After
	public void afterTest(Scenario scenario) {
		driver.close();
	}
}

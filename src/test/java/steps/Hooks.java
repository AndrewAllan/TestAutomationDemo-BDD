package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	@Before
	public void beforeTest() {
		System.out.println("this is the before hook");		
	}
	
	@After
	public void afterTest(Scenario scenario) {
		System.out.println("this is the end of the test");
	}
}

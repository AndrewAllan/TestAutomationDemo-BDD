package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import Utils.base;

public class Hooks extends base {
	@Before
	public void beforeTest() {	
	}
	
	@After
	public void afterTest(Scenario scenario) throws IOException {
		if(scenario.isFailed()==true) {
			Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
			ImageIO.write(screenshot.getImage(), "jpg", new File(System.getProperty("user.dir")+"/screenshots/"+scenario.getName()+".jpg"));
		}		
		driver.close();
	}
}

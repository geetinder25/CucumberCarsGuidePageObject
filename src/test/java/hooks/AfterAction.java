package hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import utils.SeleniumDriver;

public class AfterAction {
	@After
	public static void teardown(Scenario scenario) {
		WebDriver driver=SeleniumDriver.getDriver();
		//System.out.println("Failed Scenario: "+scenario.isFailed());
		if(scenario.isFailed()) {
			TakesScreenshot ts=(TakesScreenshot)driver;
			byte[] screenshotBytes =ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshotBytes, "image/png","image");
		}
		SeleniumDriver.tearDown();
	}
}

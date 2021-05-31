package hooks;

import io.cucumber.java.Before;
import utils.SeleniumDriver;

public class BeforeAction {
	@Before
	public static void setUp() {
		SeleniumDriver.setUpDriver();
	}

}

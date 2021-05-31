package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarSearchResultPageLocators {
	
	@FindBy(css=".carListing--textHeading")
	public WebElement listedCarsTitle;

}

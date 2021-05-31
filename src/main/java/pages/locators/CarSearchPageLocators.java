package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarSearchPageLocators {
	
	@FindBy(css="#makes")
	public WebElement carMakeDropdown;
	
	@FindBy(css="#models")
	public WebElement modelDropdown;
	
	@FindBy(css="#locations")
	public WebElement locationDropdown;
	
	@FindBy(css="#priceTo")
	public WebElement priceDropdown;
	
	@FindBy(css="#search-submit")
	public WebElement findMyNextCarBtn;
	
}

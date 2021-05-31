package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarsGuideHomePageLocators {
	
	@FindBy(css="a[href*='-car/all-new']")
	public WebElement buyPlusSellLink;
	
	@FindBy(xpath="//a[contains(text(),'Search Cars')]")
	public WebElement searchCarsLink;
	
	@FindBy(xpath="//a[contains(text(),'Used')][contains(@href,'/used-car-search')]")
	public WebElement usedLink;
	
	@FindBy(css="a[href*='/car-reviews'][class='uhf-top']")
	public WebElement reviewsLink;
	
	
	
}

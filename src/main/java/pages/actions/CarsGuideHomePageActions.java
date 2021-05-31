package pages.actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import pages.locators.CarsGuideHomePageLocators;
import utils.SeleniumDriver;

public class CarsGuideHomePageActions {
	
	CarsGuideHomePageLocators carsGuideHomePageLocators=null;
	
	public CarsGuideHomePageActions() {
		this.carsGuideHomePageLocators=new CarsGuideHomePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carsGuideHomePageLocators);
	}
	
	public void moveToBuyPlusSellTopMenu() {
		Actions actions=new Actions(SeleniumDriver.getDriver());
		actions.moveToElement(carsGuideHomePageLocators.buyPlusSellLink).perform();	
	}
	public void clickOnSearchCars() {
		//moveToBuyPlusSellTopMenu
		carsGuideHomePageLocators.searchCarsLink.click();
	}
	
	public void clickOnUsed() {
		//moveToBuyPlusSellTopMenu
		carsGuideHomePageLocators.usedLink.click();
	}
	
	public void moveToReviewsTopMenu() {
		Actions actions=new Actions(SeleniumDriver.getDriver());
		actions.moveToElement(carsGuideHomePageLocators.reviewsLink).perform();	
	}
	
}

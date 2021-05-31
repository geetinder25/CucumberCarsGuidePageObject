package pages.actions;

import org.openqa.selenium.support.PageFactory;

import pages.locators.CarSearchResultPageLocators;
import utils.SeleniumDriver;

public class CarsSearchResultPageActions {
	CarSearchResultPageLocators carSearchResultPageLocators=null;
	
	public CarsSearchResultPageActions() {
		this.carSearchResultPageLocators =new CarSearchResultPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carSearchResultPageLocators);
	}
	
	public String getTitle() {
		String title=carSearchResultPageLocators.listedCarsTitle.getText();
		return title;
	}

}

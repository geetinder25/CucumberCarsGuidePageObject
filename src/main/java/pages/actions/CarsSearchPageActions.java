package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.CarSearchPageLocators;
import utils.SeleniumDriver;

public class CarsSearchPageActions {
	
	CarSearchPageLocators carSearchPageLocators=null;
	
	public CarsSearchPageActions() {
		this.carSearchPageLocators =new CarSearchPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carSearchPageLocators);
	}
	
	public void selectCarMake(String carBrand) {
		Select select=new Select(carSearchPageLocators.carMakeDropdown);
		select.selectByVisibleText(carBrand);
	}
	public void selectModel(String model) {
		Select select=new Select(carSearchPageLocators.modelDropdown);
		select.selectByVisibleText(model);
	}
	public void selectLocation(String location) {
		Select select=new Select(carSearchPageLocators.locationDropdown);
		select.selectByVisibleText(location);
	}
	public void selectPrice(String price) {
		Select select =new Select(carSearchPageLocators.priceDropdown);
		select.selectByVisibleText(price);
	}
	public void  findMyNextCarBtn() {
		carSearchPageLocators.findMyNextCarBtn.click();
	}

}

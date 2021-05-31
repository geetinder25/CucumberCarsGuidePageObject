package steps;

import java.util.List;
import java.util.Map;
import org.testng.Assert;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.CarsGuideHomePageActions;
import pages.actions.CarsSearchPageActions;
import pages.actions.CarsSearchResultPageActions;
import utils.SeleniumDriver;

public class SearchCarsSteps {

	CarsGuideHomePageActions carsGuideHomePageActions=new CarsGuideHomePageActions();
	CarsSearchPageActions carsSearchPageActions=new CarsSearchPageActions();
	CarsSearchResultPageActions carsSearchResultPageActions=new CarsSearchResultPageActions();

	@Given("I am on the homepage {string} of CarsGuide website")
	public void i_am_on_the_homepage_of_cars_guide_website(String websiteURL) {	  
		SeleniumDriver.openPage(websiteURL);
	}

	@When("I move to the topmenu option buy + sell")
	public void i_move_to_the_topmenu_option_buy_sell(DataTable dataTable) {
		List<String> topMenuList=dataTable.asList();
		System.out.println("Top Menu selected (via list): "+topMenuList.get(1));

		Map<String,String> map=dataTable.asMap(String.class, String.class);
		System.out.println("Top Menu selected (via map): "+map);

		carsGuideHomePageActions.moveToBuyPlusSellTopMenu();
	}

	@When("I click on {string} link")
	public void i_click_on_link(String searchCars) {
		if(searchCars.equalsIgnoreCase("Search Cars")) {
			carsGuideHomePageActions.clickOnSearchCars();
		} else if (searchCars.equalsIgnoreCase("Used")) {
			carsGuideHomePageActions.clickOnUsed();
		}
	}

	@When("I select the Car brand as {string}")
	public void i_select_the_car_brand_as(String brand) {
		carsSearchPageActions.selectCarMake(brand);
	}

	@When("I select the Model as {string}")  //searchCars
	public void i_select_the_model_as(String model) {
		carsSearchPageActions.selectModel(model);
	}
	
	@When("I select the Model") //Search Used Cars
	public void i_select_the_model(DataTable dataTable) {
		List<String> list=dataTable.asList();
		System.out.println("Car model selected via list: "+list.get(2));
		carsSearchPageActions.selectModel(list.get(2));
	}

	@When("I select the Location as {string}")
	public void i_select_the_location_as(String location) {
		carsSearchPageActions.selectLocation(location);
	}

	@When("I select the Price as {string}")
	public void i_select_the_price_as(String price) {
		carsSearchPageActions.selectPrice(price);
	}

	@When("I click on Find My Next Car")
	public void i_click_on_find_my_next_car() {
		carsSearchPageActions.findMyNextCarBtn();
	}

	@Then("I should see list of searched cars from {string}")
	public void i_should_see_list_of_searched_cars_from(String brand) {
		Assert.assertTrue(carsSearchResultPageActions.getTitle().contains(brand));
	}

	@Then("I should see the page with the title {string}")
	public void i_should_see_the_page_with_the_title(String expectedTitle) {
		String actualTitle=SeleniumDriver.getDriver().getTitle();
		Assert.assertTrue(expectedTitle.equals(actualTitle));
	}

}

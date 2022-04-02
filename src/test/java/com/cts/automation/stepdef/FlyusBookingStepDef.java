package com.cts.automation.stepdef;
import java.util.List;
import java.util.Map;

import com.cts.automation.flyusbooking.PassengerInformation;
import com.cts.automation.flyusbooking.PrintPrize;
import com.cts.automation.flyusbooking.SearchPage;
import com.cts.automation.flyusbooking.SearchResult;
import com.cts.automation.flyusbooking.SeatSelect;
import com.cts.automation.utilities.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;



public class FlyusBookingStepDef extends BaseClass {
	@Given("user launches chrome and navigate to url")
	
	public void launcheschromeurl() {
		launchChrome();
		driver.get("https://www.flyus.com");
		driver.manage().window().maximize();
	}

	@When("user enters source and destination and click search")
	public void user_enters_source_and_destination_and_click_search(DataTable dataTable) throws InterruptedException
	{
		List<Map<String,String>> asMaps = dataTable.asMaps(String.class,String.class);
		SearchPage searchObj = new SearchPage();
		String source = asMaps.get(0).get("source");
		String destination = asMaps.get(0).get("destination");
		searchObj.info(source, destination);
	}

	@When("user select the flight")
	public void selectflight() throws InterruptedException {
		SearchResult resultObj = new SearchResult();
		resultObj.select();
	}

	@When("enter the below passenger information")
	public void enter_the_below_passenger_information(DataTable usercredentials) throws InterruptedException
	{
		List<Map<String,String>> asMaps = usercredentials.asMaps(String.class,String.class);
		PassengerInformation infoObj = new PassengerInformation();
		String firstname = asMaps.get(0).get("firstname");
		String lastname = asMaps.get(0).get("lastname");
		infoObj.personalInfo1(firstname, lastname);
	}

	@When("user select the seat")
	public void user_select_the_seat() throws InterruptedException {
		SeatSelect seatObj = new SeatSelect();
		seatObj.seat();
	}

	@Then("print the price")
	public void print_the_price() {
		PrintPrize prizeObj = new PrintPrize();
		prizeObj.seatPrize();
	}


}

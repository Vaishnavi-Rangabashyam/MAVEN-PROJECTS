package com.cts.automation.stepdef1;

import com.cts.automation.searchamazonproduct.SearchAmazonProducts;
import com.cts.automation.utilities.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchAmazonProductsStepDef extends BaseClass{
	@Given("user launches chrome and navigate to url")
	public void user_launches_chrome_and_navigate_to_url()
	{
	    launchChrome();
	    driver.get("https://www.amazon.in/");
	}

	@When("user enters product name as {string}")
	public void enterProductsName(String products) 
	{
		SearchAmazonProducts searchObj = new SearchAmazonProducts(driver);
		searchObj.search(products);
	    	}

	@Then("search should be successful")
	public void successful() {
		SearchAmazonProducts searchObj = new SearchAmazonProducts(driver);
		searchObj.click();
	   	}

}

package com.cts.automation.stepdef;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;

import com.cts.automation.flipkart.AddToCart;
import com.cts.automation.flipkart.ClickPrice;
import com.cts.automation.flipkart.LoginFlipkart;
import com.cts.automation.flipkart.Searchproduct;
import com.cts.automation.flyusbooking.SearchPage;
import com.cts.automation.utilities.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import junit.framework.Assert;


public class FlipkartStepDef extends BaseClass{

	@Given("user launches url")
	public void user_launches_url() {
		launchChrome();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	}
	@When("enter user and pwd and login")
	public void enter_user_and_pwd_and_login(DataTable dataTable) {
		List<Map<String,String>> asMaps = dataTable.asMaps(String.class,String.class);
		LoginFlipkart loginObj = new LoginFlipkart(driver);
		String user = asMaps.get(0).get("user");
		String pwd = asMaps.get(0).get("pwd");
		loginObj.flipkartLogin(user, pwd);

	}
	@When("user enters search element")
	public void user_enters_search_element() throws InterruptedException {
		Searchproduct searchObj = new Searchproduct(driver);
		searchObj.searchFlipkart();
	}

	@When("user click price low to high and sort")
	public void user_click_price_low_to_high_and_sort() throws InterruptedException {
		ClickPrice clickObj = new ClickPrice(driver);
		clickObj.price();
	}

	@When("Select Highest price")
	public void select_Highest_price() throws InterruptedException {
		ClickPrice clickObj = new ClickPrice(driver);
		clickObj.product();
	}

	@When("verify the actual price")
	public void verify_the_actual_price() throws InterruptedException {
		ClickPrice clickObj = new ClickPrice(driver);
		clickObj.actual();
			}

	@When("compare to the expected price and print the price")
	public void compare_to_the_expected_price_and_print_the_price() {
		ClickPrice clickObj = new ClickPrice(driver);
		clickObj.comparePrice();
		clickObj.expected();
		}
	@When("add to cart and check the name of the product and price is same or not in selected page")
	public void add_to_cart_and_check_the_name_of_the_product_and_price_is_same_or_not_in_selected_page() throws InterruptedException {
		AddToCart addObj = new AddToCart(driver);
		addObj.cart();
	}





}







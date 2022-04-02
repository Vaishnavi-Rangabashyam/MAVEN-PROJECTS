package com.cts.automation.stepdef;

import com.cts.automation.fb.FaceBookLogin;
import com.cts.automation.utilities.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FaceBookLoginStepDef extends BaseClass {
	@Given("user launches chrome")
	public void launch() {
		launchChrome();
		driver.get("https://www.facebook.com/login/");
	}

	@When("user enters username and password")
	public void enterDetails() throws InterruptedException {
		FaceBookLogin obj = new FaceBookLogin();
		obj.enterKeys("wetrggu@gmail.com", "098788jj");
		
	}

	@Then("login should be successful")
	public void login() {
		FaceBookLogin obj = new FaceBookLogin();
		obj.loginBtn();
	}
}

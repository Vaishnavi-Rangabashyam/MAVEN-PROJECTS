package com.cts.automation.test;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;

import com.cts.automation.adactin.LoginAdactinPage;
import com.cts.automation.adactin.SearchAdactinPage;
import com.cts.automation.utilities.BaseClass;

public class TestRunner extends BaseClass {
	
	@Test
	@Parameters({"username","pwd"})
	public void run(String userName , String password)
	{
		WebDriver driver = launchChrome();
		LoginAdactinPage obj = new LoginAdactinPage(driver);
		obj.login(userName, password);
		System.out.println(userName +"and"+ password);
		SearchAdactinPage obj1 = new SearchAdactinPage(driver);
		obj1.search();
	}

}

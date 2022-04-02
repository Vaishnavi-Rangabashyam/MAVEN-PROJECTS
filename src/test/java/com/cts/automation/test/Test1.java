package com.cts.automation.test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import com.cts.automation.PageObjects.Login;
import com.cts.automation.PageObjects.SearchProduct;
import com.cts.automation.utilities.HelperClass;

public class Test1 extends HelperClass{
	@Test
	public void testMethod() throws Exception
	{
		WebDriver driver = launchChrome();
		signIn();
		Login loginObj = new Login(driver);
		Thread.sleep(2000);
		loginObj.login("9360330288", "pikapikapikachu");
		loginObj.signUp();
		SearchProduct searchObj = new SearchProduct(driver);
		searchObj.search("Iphone");
		Thread.sleep(2000);
		windowHandling();
		scrollDown();
		searchObj.cart();
		
	
		
		


	}


}

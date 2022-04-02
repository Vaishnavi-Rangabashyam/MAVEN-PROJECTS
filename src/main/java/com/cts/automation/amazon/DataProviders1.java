package com.cts.automation.amazon;
import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.cts.automation.utilities.BaseClass;

import org.testng.Assert;

public class DataProviders1 extends BaseClass {
	@BeforeClass
	public void Login() throws Exception
	{
		int num = 0;
		num++;
		launchChrome();
		/*LoginAmazonPage loginObj = new LoginAmazonPage(driver);
		Thread.sleep(2000);
		loginObj.login("9360330288", "pikapikapikachu");
		if(num<=5)
			Assert.assertEquals("abc", "9360330288");
		loginObj.signUp();
*/

	}

	@Test(dataProvider="data")
	public void setup(String searchTxt1, String searchTxt2, String searchTxt3, String searchTxt4,String searchTxt5 ) throws Exception
	{
		SearchAmazonPage searchObj = new SearchAmazonPage(driver);
		Thread.sleep(2000);
		searchObj.search(searchTxt1, searchTxt2, searchTxt3, searchTxt4, searchTxt5);
		windowHandling();
		scrollDown();
		searchObj.cart();

	}
	@DataProvider(name="data")
	public Object[][] testData () throws IOException
	{
		BaseClass ref1 = new BaseClass();
		Object[][] testDataProvider = ref1.read("C:\\Users\\rprad\\eclipse-workspace\\FirstMaven\\TestData\\AmazonProducts.xlsx", "AMAZON");
		return testDataProvider;
	}


}

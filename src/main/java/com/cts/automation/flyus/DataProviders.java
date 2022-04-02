package com.cts.automation.flyus;

import java.io.IOException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.cts.automation.utilities.BaseClass;
public class DataProviders extends BaseClass{
	@BeforeClass
	public static void launch() 
	{
		launchChrome();
		driver.get("https://www.flyus.com");
	}
	@Test(dataProvider="data")
	public void  setUp(String from , String to) throws InterruptedException
	{
		LoginFlyusPage ref = new LoginFlyusPage(driver);
		ref.info1(from, to);
		ref.info();
	}

	@DataProvider(name="data")
	public Object[][] testData () throws IOException
	{
		BaseClass ref1 = new BaseClass();
		Object[][] testDataProvider = ref1.read("C:\\Users\\rprad\\eclipse-workspace\\FirstMaven\\TestData\\Flyus.xlsx", "FLYUS");
		return testDataProvider;
	}
	@Test(dataProvider="data")
	public void personalInfo( String name, String last,String name1 ,String last1) throws InterruptedException
	{
		LoginFlyusPage ref = new LoginFlyusPage(driver);
		ref.info4(name, last, name1, last1);
		/*ref.info2 (name, last);
		ref.info3(name1, last1); 
		 */	
	}
	@Test(dataProvider="data")
	public Object[][] read(String  filePath1, String fileName1) throws IOException
	{
		Object[][] testData = BaseClass.readExcel("C:\\Users\\rprad\\eclipse-workspace\\FirstMaven\\TestData\\PERSONALINFO.xlsx", "PERSONAL");
		return testData;

	}



}

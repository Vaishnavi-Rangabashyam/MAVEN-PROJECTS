package com.cts.firstmaven;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class FiveMaven {
	public static WebDriver driver ;
	@BeforeClass
	public static void setUp()
	{
		HelperClass1.launchChrome();
		
	}

	@Test
	public void rightText() throws Exception
	{
		HelperClass1.travelInfo();
	}

}

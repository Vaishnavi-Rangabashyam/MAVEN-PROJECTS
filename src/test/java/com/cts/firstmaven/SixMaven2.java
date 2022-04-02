package com.cts.firstmaven;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class SixMaven2 {
	public static WebDriver driver ;
	@BeforeClass

	public static void setUp()
	{
		HelperClass3.launchChrome();

	}

	@Test

	public void info() throws Exception
	{
		HelperClass3.maximize();
	    HelperClass3.bookInfo();
	}

}

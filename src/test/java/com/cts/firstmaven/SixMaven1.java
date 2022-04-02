package com.cts.firstmaven;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SixMaven1 {
	public static WebDriver driver ;
	@BeforeClass

	public static void setUp()
	{
		HelperClass2.launchChrome();

	}

	@Test

	public void info() throws Exception
	{
		HelperClass2.bookInfo();
	}

}

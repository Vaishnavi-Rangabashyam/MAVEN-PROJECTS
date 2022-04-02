package com.cts.firstmaven;

import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class FourMaven {
	public static WebDriver driver ;
	@BeforeClass
	public static void setUp()
	{
		HelperClass.launchChrome();
		
	}
	@Before
	public void readExcel() throws IOException, InterruptedException
	{
		HelperClass.readExcel("C:\\Users\\rprad\\eclipse-workspace\\FirstMaven\\testProject\\HOTEL.xlsx","AdactinHotel");
		
	}
	@Test
	public void rightText() throws IOException, InterruptedException
	{
		HelperClass.login("C:\\Users\\rprad\\eclipse-workspace\\FirstMaven\\testProject\\ADACTIN.xlsx", "Itinerary");
		HelperClass.writeExcel("C:\\Users\\rprad\\eclipse-workspace\\FirstMaven\\testProject\\Info.xlsx", "Name");
	}
	@After
	public void infoPage() throws IOException
	{
		HelperClass.screenShot("Cat");
		System.out.println("End of Task");
	}
	@AfterClass
	public static void close()
	{
		HelperClass.closeChrome();
	}



}

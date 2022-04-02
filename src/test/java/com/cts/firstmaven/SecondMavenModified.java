package com.cts.firstmaven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SecondMavenModified {
	public static WebDriver driver ;
	//public static HelperClass vp = new HelperClass();
	@BeforeClass
	public static void setUp()
	{
		HelperClass.launchChrome();
		
	}
	@Before
	public void readExcel() throws IOException, InterruptedException
	{
		HelperClass.readExcel("C:\\Users\\rprad\\eclipse-workspace\\FirstMaven\\testProject\\HOTEL.xlsx","AdactinHotel");
		HelperClass.login();
	}
	@Test
	public void rightText() throws IOException
	{
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

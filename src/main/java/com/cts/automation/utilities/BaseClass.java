package com.cts.automation.utilities;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver ;
	public static String s1 , s2;
	public static WebDriver launchChrome()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
	}
	public static void scrollDown2()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,100)", "");
	}
	public static void windowHandling()
	{
		Set<String> allTabs = driver.getWindowHandles();
		List<String> allTabsList = new ArrayList<>(allTabs);
		driver.switchTo().window(allTabsList.get(1));
	}
	public static void windowHandling1()
	{
		Set<String> allTabs = driver.getWindowHandles();
		List<String> allTabsList = new ArrayList<>(allTabs);
		driver.switchTo().window(allTabsList.get(0));
	}



	public static void scrollDown()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2000)", "");
	}
	public static void scrollDown1()
	{
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0,900)", "");
	}
	public Object[][] read(String filePath , String fileName) throws IOException
	{
		File TestData = new File(filePath);
		FileInputStream fis = new FileInputStream(TestData);
		XSSFWorkbook w = new XSSFWorkbook(fis);
		XSSFSheet sheet = w.getSheet(fileName);
		int row = sheet.getPhysicalNumberOfRows();
		int column = sheet.getRow(0).getPhysicalNumberOfCells();
		Object [][] testDataProvider = new Object[row][column]; 

		for(int i=0; i<sheet.getPhysicalNumberOfRows();i++)
		{
			XSSFRow eachRow = sheet.getRow(i);
			for(int j=0; j<eachRow.getPhysicalNumberOfCells();j++)
			{
				XSSFCell eachColumn = eachRow.getCell(j);
				String value =eachColumn.getStringCellValue();
				testDataProvider[i][j]= value;
			}

		}
		return testDataProvider;
	}
	public static Object[][] readExcel(String  filePath1, String fileName1) throws IOException
	{
		File TestData = new File(filePath1);
		FileInputStream fis = new FileInputStream(TestData);
		XSSFWorkbook w = new XSSFWorkbook(fis);
		XSSFSheet sheet = w.getSheet(fileName1);
		int row = sheet.getPhysicalNumberOfRows();
		int column = sheet.getRow(0).getPhysicalNumberOfCells();
		Object [][] testData = new Object[row][column]; 

		for(int i=0; i<sheet.getPhysicalNumberOfRows();i++)
		{
			XSSFRow eachRow = sheet.getRow(i);
			for(int j=0; j<eachRow.getPhysicalNumberOfCells();j++)
			{
				XSSFCell eachColumn = eachRow.getCell(j);
				String value =eachColumn.getStringCellValue();
				testData[i][j]= value;
			}

		}
		return testData;

	}
}

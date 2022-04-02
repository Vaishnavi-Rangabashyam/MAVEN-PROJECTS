package com.cts.firstmaven;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
public class SecondMaven {
	public String s1 , s2;
	public static WebDriver driver ;
	@BeforeClass
	public static void setUp() throws IOException, InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/index.php");
	}
	@Before
	public void readExcel() throws IOException
	{
		File testProject = new File ("C:\\Users\\rprad\\eclipse-workspace\\FirstMaven\\testProject\\HOTEL.xlsx");
		FileInputStream fis = new FileInputStream (testProject);
		XSSFWorkbook w = new XSSFWorkbook(fis);
		XSSFSheet sheet = w.getSheet("AdactinHotel");	
		XSSFRow row = sheet.getRow(0);
		XSSFCell cell1 = row.getCell(0);
		XSSFCell cell2 = row.getCell(1);
		s1 = cell1.toString();
		s2 = cell2.toString();
	}
	@Test
	public void enterTxt() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement UserNameTxt = driver.findElement(By.xpath("//input[contains(@name,'username')]"));
		UserNameTxt.sendKeys(s1);
		Thread.sleep(3000);
		WebElement PasswordTxt = driver.findElement(By.xpath("//input[contains(@name,'password')]"));
		PasswordTxt.sendKeys(s2);
		WebElement LoginBtn = driver.findElement(By.xpath("//input[contains(@name,'login')]"));
		LoginBtn.click();
		System.out.println(s1);
		System.out.println(s2);
	}
	@After
	public void infoPage() throws Exception
	{
		String NameTxt = driver.findElement(By.xpath("//td[contains(@width,'150')]")).getText();
		File testProject = new File ("C:\\Users\\rprad\\eclipse-workspace\\FirstMaven\\testProject\\Info.xlsx");
		FileOutputStream fos = new FileOutputStream (testProject);
		XSSFWorkbook w = new XSSFWorkbook();
		XSSFSheet sheet = w.createSheet("Name");
		XSSFRow row1 = sheet.createRow(0);
		XSSFCell cell1 = row1.createCell(0);
		cell1.setCellValue(NameTxt);
		w.write(fos);
	}
	@AfterClass
	public static void close()
	{
		driver.close();
	}
















}



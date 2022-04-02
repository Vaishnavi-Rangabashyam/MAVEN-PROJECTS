package com.cts.firstmaven;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
public class HelperClass {
	public static WebDriver driver ;
	public static String s1 , s2;
	public static void maximize()
	{
		driver.manage().window().maximize();
	}
	public static void launchChrome()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
	}
	public static void readExcel(String  input_Flocation, String sName) throws IOException
	{
		System.out.println(input_Flocation);
		new File (input_Flocation);
		FileInputStream fis = new FileInputStream (input_Flocation);
		XSSFWorkbook w = new XSSFWorkbook(fis);
		XSSFSheet sheet = w.getSheet(sName);	
		XSSFRow row = sheet.getRow(0);
		XSSFCell cell1 = row.getCell(0);
		XSSFCell cell2 = row.getCell(1);
		s1 = cell1.toString();
		s2 = cell2.toString();
	}
	public static void login(String Output_sheet, String sName) throws InterruptedException, IOException
	{
		WebElement UserNameTxt = driver.findElement(By.xpath("//input[contains(@name,'username')]"));
		UserNameTxt.sendKeys(s1);
		Thread.sleep(3000);
		WebElement PasswordTxt = driver.findElement(By.xpath("//input[contains(@name,'password')]"));
		PasswordTxt.sendKeys(s2);
		WebElement LoginBtn = driver.findElement(By.xpath("//input[contains(@name,'login')]"));
		LoginBtn.click();
		System.out.println(s1);
		System.out.println(s2);
		driver.findElement(By.xpath("//select[contains(@name,'location')]")).click();
		driver.findElement(By.xpath("//select//option[contains(text(),'Sydney')]")).click();
		driver.findElement(By.xpath("//select[contains(@name,'hotels')]")).click();
		driver.findElement(By.xpath("//select//option[contains(text(),'Hotel Sunshine')]")).click();
		driver.findElement(By.xpath("//select[contains(@name,'room_type')]")).click();
		driver.findElement(By.xpath("//select//option[contains(text(),'Double')]")).click();
		driver.findElement(By.xpath("//select[contains(@name,'room_nos')]")).click();
		driver.findElement(By.xpath("(//select//option[contains(text(),'2 - Two')])[1]")).click();
		driver.findElement(By.xpath("//select[contains(@name,'adult_room')]")).click();
		driver.findElement(By.xpath("(//select//option[contains(text(),'1 - One')])[2]")).click();
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		driver.findElement(By.xpath("//input[contains(@name,'radiobutton_0')]")).click();
		driver.findElement(By.xpath("//input[contains(@name,'continue')]")).click();
		driver.findElement(By.xpath("//input[contains(@name,'first_name')]")).sendKeys("Vaishnavi");
		driver.findElement(By.xpath("//input[contains(@name,'last_name')]")).sendKeys("Rangabashyam");
		driver.findElement(By.xpath("//textarea[contains(@name,'address')]")).sendKeys("GandhiNagar,Salem");
		driver.findElement(By.xpath("//input[contains(@name,'cc_num')]")).sendKeys("9876543210543216");
		driver.findElement(By.xpath("//select[contains(@name,'cc_type')]")).click();
		driver.findElement(By.xpath("//select//option[contains(text(),'VISA')]")).click();
		driver.findElement(By.xpath("//select[contains(@name,'cc_exp_month')]")).click();
		driver.findElement(By.xpath("//select//option[contains(text(),'March')]")).click();
		driver.findElement(By.xpath("//select[contains(@name,'cc_exp_year')]")).click();
		driver.findElement(By.xpath("//select//option[contains(text(),'2022')]")).click();
		driver.findElement(By.xpath("//input[contains(@name,'cc_cvv')]")).sendKeys("444");
		driver.findElement(By.xpath("//input[contains(@name,'book_now')]")).click();
		driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
		String RnC = driver.findElement(By.xpath("(//tbody//tr//td)[15]")).getText();
		new File(Output_sheet);
		FileOutputStream fos = new FileOutputStream (Output_sheet);
		XSSFWorkbook w = new XSSFWorkbook();
		XSSFSheet sheet = w.createSheet(sName);
		XSSFRow row1 = sheet.createRow(0);
		XSSFCell cell1 = row1.createCell(0);
		cell1.setCellValue(RnC);
		w.write(fos);
	}
	public static void writeExcel(String output_Flocation, String sName) throws IOException
	{
		String NameTxt = driver.findElement(By.xpath("(//td[contains(@align,'right')])[2]")).getText();
		System.out.println(output_Flocation);
		new File (output_Flocation);
		FileOutputStream fos = new FileOutputStream (output_Flocation);
		XSSFWorkbook w = new XSSFWorkbook();
		XSSFSheet sheet = w.createSheet(sName);
		XSSFRow row1 = sheet.createRow(0);
		XSSFCell cell1 = row1.createCell(0);
		cell1.setCellValue(NameTxt);
		w.write(fos);
	}
	public static void screenShot(String fileName) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File Screenshots = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Screenshots,new File ("C:\\Users\\rprad\\eclipse-workspace\\FirstMaven\\MavenShots\\" + fileName +".jpeg"));
	}
	public static void closeChrome()
	{
		driver.close();
	}
	
}

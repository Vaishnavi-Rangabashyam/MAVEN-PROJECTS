package com.cts.firstmaven;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HelperClass1 {
	public static WebDriver driver ;
	public static void maximize()
	{
		driver.manage().window().maximize();
	}
	public static void launchChrome()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.tnstc.in/TNSTCOnline/");
	}
	public static void travelInfo() throws Exception
	{
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//input[@class='ui-autocomplete-input'])[1]")).sendKeys("CHENNAI ALL-PLACES");
		
		//driver.findElement(By.xpath("(//span[@class='ui-helper-hidden-accessible'])[1]")).click();
		driver.findElement(By.xpath("(//input[@class='ui-autocomplete-input'])[2]")).sendKeys("COIMBATORE");
		//driver.findElement(By.xpath("(//span[@class='ui-helper-hidden-accessible'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='txtdeptDateRtrip']")).click();
		driver.findElement(By.xpath("//td[@id='deptDateRtripimgExact']")).click();
		driver.findElement(By.xpath("//div[@class='calendar']")).click();
		driver.findElement(By.xpath("(//thead//tr//td[@class=\"title\"])[4]")).click();
		driver.findElement(By.xpath("(//tbody//tr//td[@class=' day false'])[1]")).click();
		driver.findElement(By.xpath("//div[@class='btnTxt']")).click();
		
	}





}

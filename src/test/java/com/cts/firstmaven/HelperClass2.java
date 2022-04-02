package com.cts.firstmaven;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HelperClass2 {
	public static WebDriver driver ;
	public static void maximize()
	{
		driver.manage().window().maximize();
	}
	public static void launchChrome()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://in.bookmyshow.com/");
	}
	public static void bookInfo() throws Exception
	{
		driver.manage().window().maximize();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//button[@id='wzrk-cancel']")).click();
		driver.findElement(By.xpath("//span[text()='Chennai']")).click();
		driver.findElement(By.xpath("(//a[@class='sc-iGPElx dYqNfN'])[1]")).click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,100)", "");
		driver.findElement(By.xpath("(//div[@class='sc-7o7nez-0 bJKnib'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@data-phase=\"postRelease\"])[1]")).click();
		driver.findElement(By.xpath("(//a[@class='date-href'])[5]")).click();
		driver.findElement(By.xpath("(//a[@class='showtime-pill'])[1]")).click();
		driver.findElement(By.xpath("//div[@id='btnPopupAccept']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@id='pop_1']")).click();
		driver.findElement(By.xpath("//div[@id='proceed-Qty']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='_available'])[1]")).click();
		driver.findElement(By.xpath("(//a[@id='btmcntbook'])[1]")).click();
		TakesScreenshot ts = (TakesScreenshot)driver;
		File Screenshots = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Screenshots,new File ("C:\\Users\\rprad\\eclipse-workspace\\FirstMaven\\MavenShots\\bookInfo.jpeg"));
		Actions acc = new Actions (driver);
		WebElement cursorPnt = driver.findElement(By.xpath("(//li[@class='_total-section'])[1]"));
		acc.moveToElement(cursorPnt);
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(10,2000)", "");

	}
}

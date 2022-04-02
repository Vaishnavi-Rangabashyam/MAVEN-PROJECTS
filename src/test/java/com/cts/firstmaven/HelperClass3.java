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

import io.github.bonigarcia.wdm.WebDriverManager;

public class HelperClass3 {
	public static WebDriver driver ;
	public static void maximize()
	{
		driver.manage().window().maximize();
	}
	public static void launchChrome()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.ticketnew.com/");
	}
	public static void bookInfo() throws Exception
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[text()='Coimbatore'])[1]")).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)", "");
		driver.findElement(By.xpath("(//a[contains(text(),'View More')])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='book'])[2]")).click();
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0,200)", "");
		driver.findElement(By.xpath("(//a[contains(@onclick,'TKTNEW.Misc.setLoader')])[2]")).click();
		driver.findElement(By.xpath("(//a[contains(@data-venuen,'INOX PROZONE MALL')])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='I Accept']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//td[@data-seatname='B'])[3]")).click();
		driver.findElement(By.xpath("(//div[@class='tn-button tn-button-continue'])[1]")).click();
		TakesScreenshot ts = (TakesScreenshot)driver;
		File Screenshots = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Screenshots,new File ("C:\\Users\\rprad\\eclipse-workspace\\FirstMaven\\MavenShots\\ticketInfo.jpeg"));

	}

}

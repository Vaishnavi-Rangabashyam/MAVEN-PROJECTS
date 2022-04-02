package com.cts.automation.utilities;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HelperClass {
	public static WebDriver driver ;
	public static void maximize()
	{
		driver.manage().window().maximize();
	}
	public static WebDriver launchChrome()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		return driver;
	}
	public void signIn() throws Exception
	{
		driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
	}
public static void scrollDown()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,700)", "");
	}
public void windowHandling()
{
	Set<String> allTabs = driver.getWindowHandles();
	List<String> allTabsList = new ArrayList<>(allTabs);
	driver.switchTo().window(allTabsList.get(1));
	}
}

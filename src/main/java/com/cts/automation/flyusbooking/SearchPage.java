package com.cts.automation.flyusbooking;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cts.automation.utilities.BaseClass;

public class SearchPage extends BaseClass {
	public SearchPage() 
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@placeholder='From']")
	public WebElement depart;
	@FindBy(xpath="//input[@placeholder='To']")
	public WebElement arrival;
	@FindBy(xpath="//input[@id='flys-date-0']")
	public WebElement date;
	@FindBy(xpath="//th[contains(text(),'April 2022')]")
	public WebElement month;
	@FindBy(xpath="(//td[contains(@class,'available')])[15]")
	public WebElement day1;
	@FindBy(xpath="(//td[contains(text(),'21')])[2]")
	public WebElement day2;
	//@FindBy(xpath="//a[@class='incr-btn increase-adt']")
	//public WebElement adultno;
	@FindBy(xpath="//a[@class='dropdown-toggle w-full block flys-class-ui']")
	public WebElement economy;
	@FindBy(xpath="(//button[@type='submit'])[1]")
	public WebElement search;
	@FindBy(xpath="(//button[@type='button'])[1]")
	public WebElement close;

	
	public void info(String source , String destination) throws InterruptedException
	{
		depart.sendKeys(source);
		arrival.sendKeys(destination);
		Thread.sleep(2000);
		date.click();
		month.click();
		day1.click();
		day2.click();
		//adultno.click();
		economy.click();
		search.click();
		Thread.sleep(25000);
		close.click();

		
	}

}

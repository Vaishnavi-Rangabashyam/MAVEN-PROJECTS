package com.cts.automation.flyus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cts.automation.utilities.BaseClass;
public class LoginFlyusPage {
	public LoginFlyusPage(WebDriver driver) 
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
	@FindBy(xpath="(//td[contains(text(),'4')])[4]")
	public WebElement day2;
	@FindBy(xpath="//a[@class='incr-btn increase-adt']")
	public WebElement adultno;
	@FindBy(xpath="//a[@class='dropdown-toggle w-full block flys-class-ui']")
	public WebElement economy;
	@FindBy(xpath="(//button[@type='submit'])[1]")
	public WebElement search;
	@FindBy(xpath="(//button[@type='button'])[1]")
	public WebElement close;
	@FindBy(xpath="(//span[@class='h4 inline pull-left m-t-xs m-b-none m-l-md'])[1]")
	public WebElement select;
	@FindBy(xpath="//input[@id='fname-pax-0']")
	public WebElement firstName;
	@FindBy(xpath="//input[@id='lname-pax-0']")
	public WebElement lastName;
	@FindBy(xpath="//select[@id='gender-pax-0']")
	public WebElement gender;
	@FindBy(xpath="(//option[text()='Female'])[1]")
	public WebElement female;
	@FindBy(xpath="//input[@id='paxes-ADULT-0-dob']")
	public WebElement dob;
	@FindBy(xpath="(//a[@type='button'])[1]")
	public WebElement back;
	@FindBy(xpath="(//a[@class='btn no-radius ng-binding'])[18]")
	public WebElement year;
	@FindBy(xpath="(//a[@class='btn no-radius ng-binding'])[5]")
	public WebElement month1;
	@FindBy(xpath="(//a[@class='btn btn-sm no-radius ng-binding ng-scope'])[29]")
	public WebElement date1;
	@FindBy(xpath="//input[@id='fname-pax-1']")
	public WebElement firstName1;
	@FindBy(xpath="//input[@id='lname-pax-1']")
	public WebElement lastName1;
	@FindBy(xpath="//select[@id='gender-pax-1']")
	public WebElement gender1;
	@FindBy(xpath="(//option[@value='M'])[2]")
	public WebElement male;
	@FindBy(xpath="//input[@name='paxes[ADULT-1][dob]']")
	public WebElement dob1;
	@FindBy(xpath="//a[@class='btn btn-sm no-radius pull-left uib-left']")
	public WebElement back1;
	@FindBy(xpath="(//a[@class='btn no-radius ng-binding'])[13]")
	public WebElement year1;
	@FindBy(xpath="(//a[@class='btn no-radius ng-binding'])[2]")
	public WebElement month2;
	@FindBy(xpath="(//a[@class='btn btn-sm no-radius ng-binding ng-scope'])[27]")
	public WebElement date2;
	@FindBy(xpath="(//td[@data-seat-code='24D'])[3]")
	public WebElement seat1;
	@FindBy(xpath="(//a[@class='btn btn-purple btn-block font-bold sm-select-seat-btn'])[3]")
	public WebElement selectSeat1;
	@FindBy (xpath="(//td[@data-seat-code='24E'])[3]")
	public WebElement seat2;
	@FindBy(xpath="(//a[@class='btn btn-purple btn-block font-bold sm-select-seat-btn'])[3]")
	public WebElement selectSeat2;
	public void info() throws InterruptedException
	{
		date.click();
		month.click();
		day1.click();
		day2.click();
		adultno.click();
		economy.click();
		search.click();
		Thread.sleep(25000);
		close.click();
		BaseClass.scrollDown();
		Thread.sleep(2000);
		select.click();
		BaseClass.scrollDown1();
		Thread.sleep(25000);
		gender.click();
		female.click();
		dob.click();
		back.click();
		back.click();
		year.click();
		month1.click();
		date1.click();
		Thread.sleep(25000);
		gender1.click();
		male.click();
		back1.click();
		back1.click();
		year1.click();
		month2.click();
		date2.click();
		Thread.sleep(25000);
		seat1.click();
		selectSeat1.click();
		seat2.click();
		selectSeat2.click();

	}
	public void info4(String name ,String last,String name1 , String last1) throws InterruptedException
	{
		firstName.sendKeys(name);
		lastName.sendKeys(last);
		Thread.sleep(20000);
		firstName1.sendKeys(name1);
		lastName1.sendKeys(last1);

	}

	public void info1(String from, String to)
	{
		depart.sendKeys(from);
		arrival.sendKeys(to);
	}


}

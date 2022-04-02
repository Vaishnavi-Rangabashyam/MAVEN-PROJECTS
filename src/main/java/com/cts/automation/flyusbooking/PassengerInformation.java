package com.cts.automation.flyusbooking;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cts.automation.utilities.BaseClass;

public class PassengerInformation extends BaseClass {
	public PassengerInformation()
	{
		PageFactory.initElements(driver, this);
	}
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
		public void personalInfo1(String firstname, String lastname) throws InterruptedException
	{
		BaseClass.scrollDown1();
		Thread.sleep(10000);
		firstName.sendKeys(firstname);
		lastName.sendKeys(lastname);
		gender.click();
		female.click();
		Thread.sleep(5000);
		dob.click();
		back.click();
		back.click();
		Thread.sleep(5000);
		year.click();
		month1.click();
		date1.click();
			}
}

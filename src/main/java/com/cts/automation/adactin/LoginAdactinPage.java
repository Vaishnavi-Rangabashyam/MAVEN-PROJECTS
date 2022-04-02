package com.cts.automation.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cts.automation.utilities.BaseClass;

public class LoginAdactinPage extends BaseClass {
	public LoginAdactinPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[contains(@name,'username')]")
	public WebElement userNameTxt;
	@FindBy(xpath="//input[contains(@name,'password')]")
	public WebElement passwordTxt;
	@FindBy(xpath="//input[contains(@name,'login')]")
	public WebElement submit;
	
	public void login(String userName , String password) 
	{
		userNameTxt.sendKeys(userName);
		passwordTxt.sendKeys(password);
		submit.click();
	}
}

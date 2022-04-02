package com.cts.automation.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginAmazonPage {
	public LoginAmazonPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='email']")
	public WebElement emailTxt;
	@FindBy(xpath="//input[@id='continue']")
	public WebElement continueBtn;
	@FindBy(xpath="//input[@name='password']")
	public WebElement passwordTxt;
	@FindBy(xpath="//input[@id='signInSubmit']")
	public WebElement signInLnk;
	public void login(String email,String pwd )
	{
		emailTxt.sendKeys(email);
		continueBtn.click();
		passwordTxt.sendKeys(pwd);
	}
	public void signUp()
	{
		signInLnk.click();
	}


}

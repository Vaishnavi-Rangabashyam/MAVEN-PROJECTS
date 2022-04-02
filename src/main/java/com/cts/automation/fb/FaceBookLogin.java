package com.cts.automation.fb;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cts.automation.utilities.BaseClass;

public class FaceBookLogin extends BaseClass {
	public FaceBookLogin()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[@data-cookiebanner='accept_button']")
	public WebElement cookieBtn;
	@FindBy(xpath="//button[@data-cookiebanner='accept_button']")
	public WebElement userNameTxt;
	@FindBy(xpath="//input[@placeholder='Password']")
	public WebElement passwordTxt;
	@FindBy(xpath="//button[@name='login']")
	public WebElement login;
	
	public void enterKeys(String userName , String password) throws InterruptedException 
	{
		Thread.sleep(5000);
		cookieBtn.click();
		userNameTxt.sendKeys(userName);
		passwordTxt.sendKeys(password);
	}
	public void loginBtn()
	{
		login.click();
	}

}

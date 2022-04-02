package com.cts.automation.flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginFlipkart {
public LoginFlipkart(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
public WebElement username;
@FindBy(xpath="//input[@class='_2IX_2- _3mctLh VJZDxU']")
public WebElement password;
@FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
public WebElement login;

public void flipkartLogin(String user,String pwd)
{
	username.sendKeys(user);
	password.sendKeys(pwd);
	login.click();
}
}

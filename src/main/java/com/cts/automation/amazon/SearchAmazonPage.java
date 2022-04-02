package com.cts.automation.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchAmazonPage {
	public SearchAmazonPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	public WebElement searchTab;
	@FindBy(xpath="//input[@type='submit']")
	public WebElement searchBtn;
	@FindBy(xpath="(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")
	public WebElement clickFirstEle;
	@FindBy (xpath="//input[@id='add-to-cart-button']")
	public WebElement addCart;
	@FindBy(xpath="//span[@class='a-button a-button-normal a-button-span12 a-button-primary']")
	public WebElement proceed;
	public void search(String searchTxt1,String searchTxt2, String searchTxt3, String searchTxt4,String searchTxt5)
	{
		searchTab.sendKeys(searchTxt1);
		searchTab.sendKeys(searchTxt2);
		searchTab.sendKeys(searchTxt3);
		searchTab.sendKeys(searchTxt4);
		searchTab.sendKeys(searchTxt5);

		searchBtn.click();
		clickFirstEle.click();
	}
	public void cart() throws Exception
	{
		addCart.click();
		Thread.sleep(2000);
		proceed.click();
	}

}

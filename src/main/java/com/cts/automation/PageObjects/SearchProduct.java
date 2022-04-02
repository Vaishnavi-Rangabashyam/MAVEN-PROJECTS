package com.cts.automation.PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SearchProduct  {
	public SearchProduct(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	public WebElement searchTab;
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	public WebElement searchBtn;
	@FindBy(xpath="(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")
	public WebElement productClk;
	@FindBy (xpath="//input[@id='add-to-cart-button']")
	public WebElement addCart;
	@FindBy(xpath="(//input[@class='a-button-input'])[28]")
	public WebElement checkOut;
	public void search(String searchTxt)
	{
		searchTab.sendKeys(searchTxt);
		searchBtn.click();
		productClk.click();
	}

	public void cart() throws Exception
	{
		addCart.click();
		Thread.sleep(2000);
		checkOut.click();
	}
	}

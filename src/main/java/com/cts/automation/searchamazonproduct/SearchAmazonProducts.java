package com.cts.automation.searchamazonproduct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchAmazonProducts {
	public SearchAmazonProducts(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	public WebElement searchTab;
	@FindBy(xpath="//input[@type='submit']")
	public WebElement searchBtn;
public void search(String products)
{
	searchTab.sendKeys(products);
	
}
public void click()
{
	searchBtn.click();
}
}

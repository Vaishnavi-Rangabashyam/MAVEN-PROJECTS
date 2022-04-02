package com.cts.automation.flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchproduct {
	public Searchproduct(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@title='Search for products, brands and more']")
	public WebElement searchTab;
	@FindBy(xpath="//button[@class='L0Z3Pu']")
	public WebElement search;

	public void searchFlipkart() throws InterruptedException
	{
		Thread.sleep(8000);
		searchTab.sendKeys("Iphone");
		Thread.sleep(5000);
		search.click();
	}
}

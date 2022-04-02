package com.cts.automation.flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cts.automation.utilities.BaseClass;

public class AddToCart {
	public WebDriver driver;
	
	public AddToCart(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[text()='ADD TO CART']")
	public WebElement addCart;
	@FindBy(xpath="//span[@class='B_NuCI']")
	public WebElement productName;
	@FindBy(xpath="//div[@class='_30jeq3 _16Jk6d']")
	public WebElement productPrice;
	@FindBy(xpath="//a[@class='_3SkBxJ']")
	public WebElement cartClick;
	@FindBy(xpath="//div[@class='_2-uG6-']")
	public WebElement cartProductName;
	@FindBy(xpath="(//span[@class='_2-ut7f _1WpvJ7'])[1]")
	public WebElement cartProductPrice;

	public void cart() throws InterruptedException
	{
		Thread.sleep(8000);
		addCart.click();
		String PName1 = productName.getText();
		String Price1 = productPrice.getText();
		Thread.sleep(8000);
		cartClick.click();
		String PName2 = cartProductName.getText();
		String Price2 = cartProductPrice.getText();
		
		if (PName1.equals(PName2)) 
		 {
			System.out.println("Product Name matches");
		 }
		else 
		{
			System.out.println("Product Name Does not matches");
		 }
		if (Price1.equals(Price2)) 
		 {
			System.out.println("Product Price matches");
		 }
		else 
		{
			System.out.println("Product Price Does not matches");
		 }

	}

}

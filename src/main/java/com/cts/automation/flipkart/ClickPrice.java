package com.cts.automation.flipkart;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.cts.automation.utilities.BaseClass;
public class ClickPrice {
	public WebDriver driver;
	public ClickPrice(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath="//div[text()='Price -- Low to High']")
	public WebElement clickLowPrice;
	@FindBy (xpath="(//div[@class='_4rR01T'])[24]")
	public WebElement clickProduct;
	@FindBy(xpath="//div[@class='_30jeq3 _16Jk6d']")
	public WebElement actualPrice;
	@FindBy(xpath="//div[@class='_30jeq3 _16Jk6d']")
	public WebElement previous;


	public void price() throws InterruptedException
	{
		Thread.sleep(5000);
		clickLowPrice.click();
		Thread.sleep(2000);
		List<WebElement> price = driver.findElements(By.xpath("//div[@class='_25b18c']"));
		System.out.println(price.size());

		for (int i = 0; i<price.size(); i=i+1) 
		{
			System.out.println(price.get(i).getText());          
		} 

	}
	public void product() throws InterruptedException
	{
		Thread.sleep(8000);
		clickProduct.click();
		BaseClass.windowHandling();
	}
	public void actual() throws InterruptedException
	{
		Thread.sleep(5000);
		System.out.println("*********Actual Price*********");
		System.out.println(actualPrice.getText());
	}
	public void comparePrice()
	{
		List<WebElement> price = driver.findElements(By.xpath("//div[@class='_25b18c']"));
		List<String> prices = new ArrayList<String>();
		for (WebElement e : price)
		{
		    prices.add(e.getText());
		}
		List<String> sortedPrices = new ArrayList<String>(prices);
		Collections.sort(sortedPrices);
		System.out.println("**********Compare Price**********");
		System.out.println(sortedPrices.equals(prices));
		

	}
	public void expected() 
	{
		System.out.println("*********Priveous Price*********");
		System.out.println(previous.getText());
	}
}

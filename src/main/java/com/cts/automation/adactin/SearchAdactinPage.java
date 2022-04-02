package com.cts.automation.adactin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class SearchAdactinPage {
	public SearchAdactinPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//select[contains(@name,'location')]")
	public WebElement locationTab;
	@FindBy(xpath="//select//option[contains(text(),'Sydney')]")
	public WebElement selectplace;
	@FindBy(xpath="//select[contains(@name,'hotels')]")
	public WebElement hotelTab;
	@FindBy (xpath="//select//option[contains(text(),'Hotel Sunshine')]")
	public WebElement selectHotel;
	@FindBy(xpath="//select[contains(@name,'room_type')]")
	public WebElement roomTab;
	@FindBy(xpath="//select//option[contains(text(),'Double')]")
	public WebElement selectRoom;
	@FindBy(xpath="//select[contains(@name,'room_nos')]")
	public WebElement nosTab;
	@FindBy(xpath="(//select//option[contains(text(),'2 - Two')])[1]")
	public WebElement selectNos;
	@FindBy (xpath="//select[contains(@name,'adult_room')]")
	public WebElement adultTab;
	@FindBy(xpath="(//select//option[contains(text(),'1 - One')])[2]")
	public WebElement selectAdult;
	@FindBy(xpath="//input[@type='submit']")
	public WebElement submitTab;
	public void search()
	{
		locationTab.click();
		selectplace.click();
		hotelTab.click();
		selectHotel.click();
		roomTab.click();
		selectRoom.click();
		nosTab.click();
		selectNos.click();
		adultTab.click();
		selectAdult.click();
		submitTab.click();
		
		
		
	}

	

}

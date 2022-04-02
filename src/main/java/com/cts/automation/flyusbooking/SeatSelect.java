package com.cts.automation.flyusbooking;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cts.automation.utilities.BaseClass;

public class SeatSelect extends BaseClass{
public SeatSelect()
{
	PageFactory.initElements(driver, this);

}
@FindBy(xpath="(//td[@data-seat-code='18H'])[3]")
public WebElement clickSeat;
@FindBy(xpath="(//a[@class='btn btn-purple btn-block font-bold sm-select-seat-btn'])[3]")
public WebElement selectSeat;
public void seat() throws InterruptedException
{
	Thread.sleep(10000);
	clickSeat.click();
	Thread.sleep(5000);
	selectSeat.click();

}


}

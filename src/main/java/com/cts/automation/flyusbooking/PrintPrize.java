package com.cts.automation.flyusbooking;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cts.automation.utilities.BaseClass;

public class PrintPrize extends BaseClass {
public PrintPrize()
{
	PageFactory.initElements(driver, this);

}
@FindBy(xpath="(//b[@class='sm-seg-total ng-binding'])[1]")
public WebElement prize;
public void seatPrize()
{
	System.out.println(prize.getText());
	}
}

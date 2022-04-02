package com.cts.firstmaven;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstSeleniumMaven {
	public static void main(String[] args) throws InterruptedException, IOException {
		File testProject = new File ("C:\\Users\\rprad\\eclipse-workspace\\FirstMaven\\testProject\\WT.xls");
		FileOutputStream fos = new FileOutputStream (testProject);
		HSSFWorkbook w = new HSSFWorkbook();
		HSSFSheet sheet = w.createSheet("Automation");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)", "");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File Screenshots = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Screenshots,new File ("C:\\Users\\rprad\\eclipse-workspace\\FirstMaven\\MavenShots\\webtable.jpeg"));
		Thread.sleep(3000);
		List<WebElement> allRows = driver.findElements(By.xpath("//tbody//tr"));
		for(int i=1; i<allRows.size();i++)
		{
			List<WebElement> allColumns = driver.findElements(By.xpath("(//tbody//tr) ["+ (i) +"]//td"));
			HSSFRow eachRow = sheet.createRow(i);
			for(int j=1;j<allColumns.size();j++)
			{
				HSSFCell cell = eachRow.createCell(j);
				String eachvalue = driver.findElement(By.xpath("(//tbody//tr)["+(i)+"]//td [ " + (j)+"]")).getText();
				cell.setCellValue(eachvalue);
			}
			System.out.println();
		}
        w.write(fos);
		

	

	}

}

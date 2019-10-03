package javaPractice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import Base.BasePage;
import extentReports.ExtReportDemo;

public class TC003 extends ExtReportDemo {
	
	public static WebDriver driver;
	
	@Test
	public void TC_0003() throws IOException 
	{
			test = extent.createTest("TC_0003");

			driver = Base.BasePage.Initialize();
			driver.get("https://www.yahoo.com");
			driver.findElement(By.id("abc")).click();
			System.out.println("****NOT PRINTED****");
			
			
	}
	
	
	@AfterClass
	public void TearDown()
	{
		BasePage.TearDown();
	}


}

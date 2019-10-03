package javaPractice;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import Base.BasePage;
import extentReports.ExtReportDemo;

public class TC002 extends ExtReportDemo{
	
public static WebDriver driver;
	

	@Test
	public void TC_0002() throws IOException 
	{
			test = extent.createTest("TC_0002");

			driver = Base.BasePage.Initialize();
			driver.get("https://www.facebook.com");
			String title =driver.getTitle();
			
			System.out.println("Title is : "+title);
	}
	
	
	@AfterClass
	public void TearDown()
	{
		BasePage.TearDown();
	}

}

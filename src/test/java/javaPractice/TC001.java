package javaPractice;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import Base.BasePage;
import extentReports.ExtReportDemo;

public class TC001 extends ExtReportDemo {
	
	public static WebDriver driver;
	

	@Test
	public void TC_0001() throws IOException 
	{
			test = extent.createTest("TC_0001");

			driver = Base.BasePage.Initialize();
			driver.get("https://www.gmail.com");
			Assert.assertTrue(false);
	}
	
	
	@AfterClass
	public void TearDown()
	{
		BasePage.TearDown();
	}
}



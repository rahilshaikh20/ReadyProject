package extentReports;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Base.BrowserFactory;
import Base.GetScreenShot;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

class NewTest1 extends ExtReportDemo {
	BrowserFactory b = new BrowserFactory();
	WebDriver driver;

	@Test
	public void TC1() throws IOException
	{
		test = extent.createTest("Rahil_TC1");

		driver = b.loadDriver();
		driver.get("https://www.geeksforgeeks.org");

		GetScreenShot.captureScreenshot(driver);
		GetScreenShot.captureScreenshot(driver);
		GetScreenShot.captureScreenshot(driver);
		

	}

	@AfterTest
	public void TearDown() 
	{
		driver.quit();
	}

}

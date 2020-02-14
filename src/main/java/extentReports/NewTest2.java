package extentReports;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Base.BasePage;
import Base.BrowserFactory;

public class NewTest2 extends ExtReportDemo {

	public static WebDriver driver;

	@Test
	public void TC_0001() throws IOException {

		test = extent.createTest("TC_Yahoo_Check");

		driver = Base.BasePage.Initialize();
		driver.get("https://www.yahoo.com");
		Assert.assertTrue(false);
	}

	/*
	 * @Test public void TC_0002() throws IOException {
	 * 
	 * 
	 * test = extent.createTest("TC_0002");
	 * 
	 * driver = Base.BasePage.Initialize();
	 * driver.get("https://stackoverflow.com/"); Assert.assertTrue(false); }
	 * 
	 * @Test public void TC_0003() { test = extent.createTest("TC_003");
	 * 
	 * // SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	 * Date date = new Date(); System.out.println(date);
	 * 
	 * }
	 * 
	 * @AfterMethod public void afterTest() { BasePage.TearDown(); }
	 */
	@AfterClass
	public void afterTest() {
		
		BasePage.TearDown();
	}

}

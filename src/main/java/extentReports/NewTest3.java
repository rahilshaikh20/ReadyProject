package extentReports;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.BasePage;

public class NewTest3 extends ExtReportDemo {
	
	public static WebDriver driver;
	
	@BeforeClass
	public void beforeTest() {
		
		driver=BasePage.Initialize();
		
	}

	@Test
	public void TC_0002() throws IOException 
	{

		test = extent.createTest("TC_StackOverflow_Check");

		driver = Base.BasePage.Initialize();
		driver.get("https://stackoverflow.com/");
		Assert.assertTrue(false);
	}

	@AfterClass
	public void afterTest() {

		BasePage.TearDown();
	}

}

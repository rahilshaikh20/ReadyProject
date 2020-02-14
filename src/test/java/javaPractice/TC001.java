package javaPractice;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.BasePage;
import Base.BrowserFactory;
import extentReports.ExtReportDemo;

public class TC001 extends ExtReportDemo {
	
	public static WebDriver driver;
	BrowserFactory b= new BrowserFactory();
	
	@BeforeTest
	public void bf()
	{
		System.out.println("**Before Test1**");
	}
	

	@Test
	public void TC_0001() throws IOException 
	{
			test = extent.createTest("TC_0001");
		System.out.println("**Test1**");
			//driver = b.loadDriver();
			driver =BasePage.Initialize();
			driver.get("https://www.indiatoday.in/");
			Assert.assertTrue(false);
			WebElement ele =driver.findElement(By.id("ss"));
			
			List <WebElement> links = driver.findElements(By.tagName("a"));
			
			for (WebElement value : links) {
				
				String link =value.getAttribute("href");
				System.out.println(link);
				//CheckConnection(link);
				
			}
			
			
					
	}
	
	@AfterTest
	public void AfterTest()
	{
		System.out.println("**After Test1**");
	}
	
	@AfterClass
	public void TearDown()
	{
		BasePage.TearDown();
		System.out.println("**After Class1**");
	}
}



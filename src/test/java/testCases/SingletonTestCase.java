package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;


import Base.BasePage;

//Using singleton class BasePage to create test-cases

public class SingletonTestCase {
	
	public static WebDriver driver;

	/*Using before and after class annotation for multiple execution as driver is a single instance and afterTest 
	will throw null pointer exceptions*/
	
	@BeforeClass
	public void beforeTest() {
		
		driver=BasePage.Initialize();
		
	}

	@Test
	public void SampleCase() {
		
		driver.get("https://github.com/");
		System.out.println(driver.getTitle());

	}

	@AfterClass
	public void afterTest() {
		
		BasePage.TearDown();
	}

}

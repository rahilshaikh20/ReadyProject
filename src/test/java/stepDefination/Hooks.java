package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	public static WebDriver driver;

	@Before
	public static WebDriver Initialize() {
		
		if (driver==null)
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Users\\rahilsha\\Downloads\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
			}
			return driver;
	}

	@After
	public void TearDown() {
		
		driver.quit();
		driver=null;
		
	}

}

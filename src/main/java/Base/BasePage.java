package Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Singleton approach of creating one instance of Webdriver

public class BasePage {

	public static WebDriver driver = null;

	public static WebDriver Initialize() {

		if (driver == null) {
			System.setProperty("webdriver.chrome.driver", "D:\\Users\\rahilsha\\Downloads\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();

		}
		return driver;
	}

	public static void TearDown() {
	
		driver.quit();
		driver = null;

	}

}

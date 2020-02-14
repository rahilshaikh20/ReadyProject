package Base;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//Singleton approach of creating one instance of Webdriver

public class BasePage {

	public static WebDriver driver = null;

	public static WebDriver Initialize() {

		if (driver == null) {
			//System.setProperty("webdriver.chrome.driver", "D:\\Users\\rahilsha\\Downloads\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
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
	
	public static String captureScreenshot() throws IOException
	{
		
		String pattern = "yyyy-MM-dd_HHmmss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

		String date = simpleDateFormat.format(new Date());
	     	    
		 File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(screenshotFile, new File("C:\\Rahil_ss\\image"+date+".png"));
		 
		 return "C:\\Rahil_ss\\image"+date+".png";
		 
		 
	}

}

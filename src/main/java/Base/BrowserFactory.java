/**
 * 
 */
package Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ReadExcel;
import utilities.TestUtil;

/**
 * @author rahilsha
 *
 */
public class BrowserFactory {

	public WebDriver driver;
	public Properties prop = new Properties();
	public FileInputStream fis = null;
	String URL = "http://www.google.com"; // Website name to be launched
	String Browsername = "Chrome"; // Enter the Browser name

	public Properties loadproperties() throws IOException {
		// prop = new Properties();
		fis = new FileInputStream(System.getProperty("user.dir") + "\\Base.properties");
		prop.load(fis);
		return prop;
	}

	public void loadURL() // getting URL from string(Browser factory)
	{
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	public void loadURL1() // getting URL from properties file
	{
		driver.get(prop.getProperty("APPLICATION_URL"));
		driver.manage().window().maximize();
	}

	public WebDriver loadDriver() {
		if (Browsername.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			// return driver;

		}

		else if (Browsername.equalsIgnoreCase("Chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(options);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			// return driver;
		}

		else if (Browsername.equalsIgnoreCase("IE")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			// return driver;
		}
		return driver;
	}
	
	public  void captureScreenshot() throws IOException
	{
		/*
		 * SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyy_HHmmss"); Date
		 * date = new Date();
		 */
		String pattern = "yyyy-MM-dd_HHmmss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

		String date = simpleDateFormat.format(new Date());
	     	    
		 File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(screenshotFile, new File("C:\\Rahil_ss\\image"+date+".png"));
	}

	public Object[][] getExcelData(String testCaseName, String fileName) throws IOException

	{
		Path path = Paths.get(System.getProperty("user.dir") + "\\src\\main\\resources\\" + fileName);
		if (Files.exists(path)) {
			Object[][] data = null;
			ReadExcel xls = new ReadExcel(System.getProperty("user.dir") + "\\src\\main\\resources\\" + fileName);
			data = TestUtil.getData(testCaseName, xls);
			return data;
		} else {
			System.out.println("File" + fileName + " doesnot exists ");
			return null;
		}
	}

}

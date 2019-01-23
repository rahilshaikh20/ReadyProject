package testCases;
import java.util.concurrent.TimeUnit;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import javax.xml.xpath.XPath;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import HairAdvisor.BrowserFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.io.IOException;
import java.util.Properties;
import Pages.*;
/**
 * @author rahilsha
 *
 */
public class screenshotWindowHandle
{

	BrowserFactory b= new BrowserFactory();
	WebDriver driver;
	Properties prop1 = null;
	PageOne p = new PageOne(); //to access locators defined in PageOne class
	String input= "ronaldo"; //input to be searched
	
	 	
	@Test	 
	 public void testcase_three() throws InterruptedException, IOException
	 
	   {
		driver= b.loadDriver();
		 prop1= b.loadproperties();
		 b.loadURL1();
		 //COde 
		 driver.findElement(p.text_field).sendKeys(input); //FINDING LOCATORS FROM PageOne
		 driver.findElement(By.xpath(prop1.getProperty("LOC1"))).click();//FINDING LOCATORS FROM PROPERTIES FILE
		 Thread.sleep(3000);
		 
		 
		 for (int i=0; i<3; i++) //Multiple screenshots 
			 
		 {
			 
		 File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(screenshotFile, new File("D:\\Rahil_ss\\image_"+i+".png"));
		 
		 }
		 
		
		 driver.close(); 
		 driver.quit();			
	   }

}
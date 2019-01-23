/**
 * 
 */
package testCases;
import java.util.concurrent.TimeUnit;
import javax.xml.xpath.XPath;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import HairAdvisor.BrowserFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.Properties;
import Pages.*;
/**
 * @author rahilsha
 *
 */
public class testCase2 {

	BrowserFactory b= new BrowserFactory();
	WebDriver driver;
	Properties prop1 = null;
	PageOne p = new PageOne(); //to access locators defined in PageOne class
	String input= "Messi"; //input to be searched
	 
		
		
	@Test	 
	 public void testcase_two() throws InterruptedException, IOException
	 
	   {
		driver= b.loadDriver();
		 prop1= b.loadproperties();
		 b.loadURL1();
		 //Thread.sleep(5000);
		 //COde 
		 
		// driver.findElement(By.xpath("//*[@name='q']")).sendKeys(input);;
		// driver.findElement(By.xpath("//input[@name='btnK']")).click();
		 
		 driver.findElement(p.text_field).sendKeys(input); //FINDING LOCATORS FROM PageOne
		 //driver.findElement(p.Search_button).click(); //FINDING LOCATORS FROM PageOne
		
		 driver.findElement(By.xpath(prop1.getProperty("LOC1"))).click();//FINDING LOCATORS FROM PROPERTIES FILE
		 Thread.sleep(5000);
		 
		 driver.quit();		
		 
		 //asasdasd
	   }

}

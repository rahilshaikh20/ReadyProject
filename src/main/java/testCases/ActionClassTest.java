package testCases;

import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import HairAdvisor.BrowserFactory;

public class ActionClassTest {
	
	BrowserFactory b= new BrowserFactory();
	WebDriver driver;
	Properties prop = null;

	@Test	 
	 public void testcase_actionclass() throws InterruptedException, IOException
	 
	   {
		driver= b.loadDriver();
		 prop= b.loadproperties();
		 b.loadURL1();
		 
		 Thread.sleep(8000);
		 
		 WebElement elePrivacy = driver.findElement(By.xpath("(//a[contains(text(),'Privacy')])[2]"));
	
		 //elePrivacy.click();
		 
		 Actions action=new Actions(driver);
		 action.moveToElement(elePrivacy).click().perform();
		 
		 
		/*
		
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", elePrivacy);
		Thread.sleep(3000); //Clicking using java script
		
		*/
		 Thread.sleep(3000);
		 
		driver.quit();
	}

}

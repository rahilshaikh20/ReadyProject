package testCases;

import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Base.BrowserFactory;

public class ActionClassTest {
	
	BrowserFactory b= new BrowserFactory();
	WebDriver driver;
	Properties prop = null;

	@Test	 
	 public void testcase_actionclass() throws InterruptedException, IOException
	 
	   {
		driver= b.loadDriver();
		 prop= b.loadproperties();
		 b.loadURL();
		 			 
		 WebElement SearchByVoice = driver.findElement(By.xpath("//*[@aria-label='Search by voice']//span[@class]"));
		 WebElement GmailLink = driver.findElement(By.linkText("Gmail"));
		 	
		 Actions action=new Actions(driver);
		
		 action.moveToElement(SearchByVoice).build().perform(); //To hover over element
		 action.moveToElement(GmailLink).click().perform(); //To click element using action
		 action.dragAndDrop(SearchByVoice, GmailLink).build().perform(); //to drag and drop
		 action.contextClick(GmailLink).perform(); //Right click
		 
		 Thread.sleep(5000);
		 driver.navigate().back();
		 Thread.sleep(3000);
		 
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", GmailLink); //Clicking using java script
		
		 Thread.sleep(3000);
		 
		 driver.quit();
		 
		 
	}

}

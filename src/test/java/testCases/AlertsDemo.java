package testCases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Base.BrowserFactory;

public class AlertsDemo {
	
	BrowserFactory b= new BrowserFactory();
	WebDriver driver;
	
  @Test
  public void Alert_test() throws InterruptedException {
	  
	  driver= b.loadDriver();
	  driver.get("http://demo.guru99.com/test/delete_customer.php");
	  driver.manage().window().maximize();
	  
	  WebElement Submit=driver.findElement(By.name("submit"));
	  
	  Submit.click();
	  Thread.sleep(2000);
	  
      // Switching to Alert        
      Alert alert = driver.switchTo().alert();		
      		
      // Capturing alert message.    
      String alertMessage= driver.switchTo().alert().getText();		
      		
      // Displaying alert message		
      System.out.println(alertMessage);	
      Thread.sleep(2000);
      		
      // Accepting alert		
      alert.accept();	
      Thread.sleep(5000);
      
      String alertMessage1= driver.switchTo().alert().getText();		
		
      // Displaying updated alert message		
      System.out.println(alertMessage1);	
      
      }
  
  @AfterTest
  public void AfterTest()
  
  {driver.quit();}
  
}

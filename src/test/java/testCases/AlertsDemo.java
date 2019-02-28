package testCases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
	  
	  WebDriverWait wait = new WebDriverWait(driver, 10);
	  
	  //Check if alert is present
      if(wait.until(ExpectedConditions.alertIsPresent())==null){
            System.out.println("alert was not present");
      }
      else
      {
    	  // Switching to Alert    
       Alert alert = driver.switchTo().alert();
      System.out.println("alert present");
     	  	
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
            
 }
  
  @AfterTest
  public void AfterTest()
  
  {driver.quit();}
  
}

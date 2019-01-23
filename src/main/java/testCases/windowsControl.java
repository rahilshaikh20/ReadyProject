package testCases;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowsControl {
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String URL = "https://pantene.com/en-us"; 
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(URL);
		driver.manage().window().maximize();
		
		String title = driver.getTitle(); //Title before click
		System.out.println(title);
		
		driver.findElement(By.xpath("//*[@title='Terms & Conditions']")).click();
		Thread.sleep(3000);
		
				
		/*String  handle= driver.getWindowHandle();//Return a string of alphanumeric window handle
		Thread.sleep(3000);
		System.out.println(handle);
		driver.switchTo().window(handle); *///Code to return to Home window
		
		for (String winHandle : driver.getWindowHandles()) {
		    driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
		    System.out.println(winHandle);
		}
			
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@href ='http://pgcareers.com/']")).click();
		//driver.close();
			
		String title1 = driver.getTitle(); //Title before click
		System.out.println(title1);
		
		for (String winHandle : driver.getWindowHandles()) {
		    driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
		    System.out.println(winHandle);
		}
			
		String title2 = driver.getTitle(); //Title before click
		System.out.println(title2);
		
		System.out.println("TC Passed");
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		driver.quit();
	}

}

package javaPractice;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsDuration {

	public static WebDriver driver;


	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://accounts.lambdatest.com/login");
		
		Thread.sleep(5000);

			
		/***** Time for locators *****/
		Instant start1 = Instant.now();
		driver.findElement(By.id("userpassword"));
		Instant finish1 = Instant.now();
		long timeElapsed1 = Duration.between(start1, finish1).toMillis();
		System.out.println("Duration for ID is: " + timeElapsed1);
		/***** End *****/
		
		
		/***** Time for locators *****/
		Instant start2 = Instant.now();
		driver.findElement(By.className("form-control"));
		Instant finish2 = Instant.now();
		long timeElapsed2 = Duration.between(start2, finish2).toMillis();
		System.out.println("Duration for ClassName is: " + timeElapsed2);
		/***** End *****/

		
		/***** Time for locators *****/
		Instant start3 = Instant.now();
		driver.findElement(By.cssSelector("input#userpassword.form-control"));
		Instant finish3 = Instant.now();
		long timeElapsed3 = Duration.between(start3, finish3).toMillis();
		System.out.println("Duration for CSS is: " + timeElapsed3);
		/***** End *****/

		/***** Time for locators *****/
		Instant start4 = Instant.now();
		driver.findElement(By.xpath("//div[@class='input-group']//*[@name='password']"));
		Instant finish4 = Instant.now();
		long timeElapsed4 = Duration.between(start4, finish4).toMillis();
		System.out.println("Duration for Xpath is: " + timeElapsed4);
		/***** End *****/
		// input#userpassword.form-control
		
		/***** Time for locators *****/
		Instant start = Instant.now();
		driver.findElement(By.name("password"));
		Instant finish = Instant.now();
		long timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Duration for Name is: " + timeElapsed);
		/***** End *****/

		driver.quit();

	}

}

package testCases;

import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.BrowserFactory;

public class NewTest {

	WebDriver driver = null;
	BrowserFactory bf = new BrowserFactory();
	Properties prop = null;

	@BeforeTest
	public void beforeTest() throws IOException {

		// Ctrl+shift+O for automatic imports
		driver = bf.loadDriver();
	}

	@Test
	public void testCase_Redbus() throws InterruptedException, IOException

	{

		prop = bf.loadproperties();
		bf.loadURL1();
		WebDriverWait wait = new WebDriverWait(driver, 20);

		/******************** Locators *******************/

		String OnwardDate = "//*[contains(@class, 'icon-onward-calendar icon')]";
		String ReturnDate = "//*[contains(@class, 'icon-return-calendar icon')]";
		String Search = "search_btn";
		String ViewSeats = "(//*[@class ='button view-seats fr'])[1]";
		String Boarding= "(//*[@class='sel icon icon-round'])[1]";

		
		/******************** End of Locators *******************/

		// driver.findElement(By.id("src")).sendKeys("Mumbai",Keys.TAB);
		driver.findElement(By.id("src")).sendKeys("Mumbai");
		Thread.sleep(1000);
		driver.findElement(By.id("src")).sendKeys(Keys.TAB);

		driver.findElement(By.id("dest")).sendKeys("Kudal");
		Thread.sleep(1000);
		driver.findElement(By.id("dest")).sendKeys(Keys.TAB);

		driver.findElement(By.xpath(OnwardDate)).click();
		driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']//tr[5]/td[3]")).click();

		driver.findElement(By.xpath(ReturnDate)).click();
		driver.findElement(By.xpath("//div[@id='rb-calendar_return_cal']/table/tbody/tr[6]/td[2]")).click();

		driver.findElement(By.id(Search)).click();

		// waiting for next page to load
		try {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ViewSeats)));
		} catch (Exception e) {
			System.out.println(e);
		}
		driver.findElement(By.xpath(ViewSeats)).click();
		Thread.sleep(3000);
//		new Actions(driver).moveByOffset(244, 529).click().build().perform();
		// ((JavascriptExecutor) driver).executeScript("document.elementFromPoint(244, 529).click();");
		
		driver.findElement(By.xpath(Boarding)).click();
		driver.findElement(By.cssSelector(".button.continue.inactive")).click();
		
	}

	@AfterTest
	public void beforeMethod() throws InterruptedException 
	{
		Thread.sleep(8000);
		driver.quit();
			
	}
}

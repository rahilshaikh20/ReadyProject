package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;

public class ToolsSQAFeature {
	
	public static WebDriver driver= Hooks.getDriver();
	
	@Given("^StackOverflow is launched$")
	public void stackoverflow_is_launched() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://www.toolsqa.com/");
	   
	}

	@Given("^User gets the page title$")
	public void user_gets_the_page_title() throws Throwable {
	    
		driver.findElement(By.xpath("(//span[@class ='menu-text'])[1]")).click();
		
	}

	@But("^Title is incorrect$")
	public void title_is_incorrect() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		String s1=	driver.getTitle();
		String s2=driver.getWindowHandle();
		
		System.out.println(s1+ " and "+s2);
		
	}

}

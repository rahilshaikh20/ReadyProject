package stepDefination;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginFeature {

	@Given("^login to the application$")
	public void login_to_the_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Login: Given");
	}

	@When("^enter user and pass$")
	public void enter_user_and_pass() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		System.out.println("LOGIN: When");
	}

	@Then("^verify the login$")
	public void verify_the_login() throws Throwable {
	    
		System.out.println("Login: Then");
		
	}
	@When("^enter \"([^\"]*)\" and  \"([^\"]*)\"$")
	public void EnterInputData(String arg1, String arg2) throws Throwable {
	System.out.println("User name " +arg1);
	System.out.println("Password is "+arg2);
	
	    // Write code here that turns the phrase above into concrete actions
	  
	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and_and(String arg1, String arg2, String arg3) throws Throwable 
	{
		    System.out.println("Age class and Type are: "+arg1+arg2+arg3+" respectively...");
		    
		}
	
	
}

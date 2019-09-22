
package cucumberDemo;

import org.junit.runner.RunWith;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import java.io.*;
import org.junit.AfterClass;

@RunWith(Cucumber.class)
@CucumberOptions(
		/*
		 * just you need to specify the feature file and provide the name of step definition package name,
		 it will automatically get corrponding methods to run
		 */

		features = { "Feature" }, // <- to run whole feature folder
		// features = {"features/login.feature"}, // <- to run particular feature file
		// features = {"features/login.feature", "features/test.feature"}, // <- to run
		// more than 1 feature file at once

		glue = { "stepDefination" }, // <- if you have all the step definition file in under one package
		// glue = {"stepDefinition", "stepDefinition_1"}, // if you have more than one
		// step definition file in multiple package
		tags = { "@login" }, 
		//plugin = { "pretty" } // *for html report use:* "html:target/test-report"
		
		
		plugin = { "pretty","com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report_rahil.html"}, // for extent reports
		monochrome = true
		
		)
public class TestRunner {
	
	@AfterClass
	 public static void writeExtentReport() throws IOException {
	 
		
		Reporter.loadXMLConfig(new File("C:\\Users\\rahil.shaikh\\Documents\\SeleniumProjects\\ReadyProject\\extent-config.xml")); //path where config xml is kept
		
		//Setting below properties is optional
		 Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
	     Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
	     Reporter.setSystemInfo("Machine", "Windows 10" + "64 Bit");
	     Reporter.setSystemInfo("Selenium", "3.7.0");
	     Reporter.setSystemInfo("Maven", "3.5.2");
	     Reporter.setSystemInfo("Java Version", "1.8.0_151");
		
	 }

}

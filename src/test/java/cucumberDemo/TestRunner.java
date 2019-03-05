package cucumberDemo;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		/*
		 * just you need to specify the feature file and provide the name of step definition package name,
		 it will automatically get corrponding methods to run
		 */

		features = {"Feature"},                    // <- to run whole feature folder
		//features = {"features/login.feature"},       // <- to run particular feature file
		//features = {"features/login.feature", "features/test.feature"},  // <- to run more than 1 feature file at once

		glue = {"stepDefination"},                    //<- if you have all the step definition file in under one package		
		//glue = {"stepDefinition", "stepDefinition_1"}, // if you have more than one step definition file in multiple package
		tags = {"@login"},
		plugin = { "pretty" }

		)
public class TestRunner {

}

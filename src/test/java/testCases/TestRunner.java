package testCases;

import static org.testng.Assert.assertNotNull;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

import javaPractice.TC001;
import javaPractice.TC002;
import javaPractice.TC003;

public class TestRunner {

	static TestNG test;

	public static void main(String[] args) {
		
		List<String> suites = new ArrayList();
		
		test = new TestNG();

		//test.setTestClasses(new Class[] { TC001.class, TC002.class, TC003.class }); // Used to run tests via classes.
				
		suites.add("C:\\Users\\rahil.shaikh\\Documents\\SeleniumProjects\\ReadyProject\\testng.xml");
		
		test.setTestSuites(suites);
		test.setUseDefaultListeners(false);

		test.run();


	}

}

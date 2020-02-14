package extentReports;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import org.junit.AfterClass;
import org.testng.Assert;
import org.testng.SkipException;

class NewTest extends ExtReportDemo
{
		@Test
	    public void functionality2Test1()
	    {
	        test = extent.createTest("Shankar");
	        Assert.assertTrue(1 > 0);
	        
	        //Loggers to log data in the report
	        test.log(Status.INFO, "Test started");
	        test.log(Status.INFO, "Info logged in report");
	        
	    }
	     
	    @Test(enabled = false)
	    public void functionality2Test2()
	    {
	        test = extent.createTest("functionality2Test2");
	        test.log(Status.INFO, "Info1");
	        Assert.assertEquals("Krishna", "Sakinala");
	        test.log(Status.INFO, "info2");
	    }
	     
	    @Test
	    public void functionality2Test3()
	    {
	        test = extent.createTest("functionality2Test3");
	        System.out.println("Hi");
	        System.out.println("Hello Shankar and Keval");
	        throw new SkipException("This is my skipp metho");
	     
	    }
	    
	    @AfterSuite
	    public void afterExecution()
	    {
	    	final int total =passedCount+failedCount+skippedCount;
	    	
	    	System.out.println("Passed count is: "+passedCount);
	    	System.out.println("Failed count is: "+failedCount);
	    	System.out.println("Skipped count is: "+skippedCount);
	    	System.out.println("Total testcases executed: "+total);
	    	
	    }
	  
		
	}


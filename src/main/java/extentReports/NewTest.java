package extentReports;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.SkipException;

class NewTest extends ExtReportDemo
{
		@Test
	    public void functionality2Test1()
	    {
	        test = extent.createTest("Shankar");
	        Assert.assertTrue(1 > 0);
	    }
	     
	    @Test
	    public void functionality2Test2()
	    {
	        test = extent.createTest("functionality2Test2");
	        Assert.assertEquals("Krishna", "Sakinala");
	    }
	     
	    @Test
	    public void functionality2Test3()
	    {
	        test = extent.createTest("functionality2Test3");
	        System.out.println("Hi");
	        System.out.println("Hello Shankar and Keval");
	        //Assert.assertNotEquals("Krishna", "Krishna");
	        throw new SkipException("This is my skipp metho");
	        
	        
	        
	    }
		
	}


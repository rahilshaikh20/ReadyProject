package extentReports;

import org.testng.annotations.Test;
import org.testng.Assert;

class NewTest extends ExtReportDemo
{
		@Test
	    public void functionality2Test1()
	    {
	        test = extent.createTest("functionality2Test1");
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
	        System.out.println("Hello");
	        Assert.assertNotEquals("Krishna", "Krishna");
	        
	    }
		
	}


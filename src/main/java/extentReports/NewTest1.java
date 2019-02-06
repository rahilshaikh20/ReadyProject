package extentReports;
import org.testng.annotations.Test;
import org.testng.Assert;

class NewTest1 extends ExtReportDemo
{
		@Test
	    public void TC1()
	    {
	        test = extent.createTest("Rahil_TC1");
	        Assert.assertTrue(1 > 0);
	    }
	     
	    @Test
	    public void TC2()
	    {
	        test = extent.createTest("Rahil_TC2");
	        System.out.println("This is printed");
	    }
	     
	    @Test
	    public void TC3()
	    {
	        test = extent.createTest("Rahil_TestCase_3 ");
	        System.out.println("This is also printed");
	    }
		
	}


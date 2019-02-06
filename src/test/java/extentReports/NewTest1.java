package extentReports;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest1 extends ExtReportDemo {
  @Test
  public void tc1() {
	  test = extent.createTest("Rahil's_TC");
      System.out.println("This Passed execution");
  }
}

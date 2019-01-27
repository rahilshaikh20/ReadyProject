package utilities;


import java.util.Hashtable;

public class TestUtil
{
	//static Keywords k1;
	// gets the data set for a test into a hash map array
	public static Object[][]  getData(String testCase, ReadExcel xls){
		
		// get num of the row where the test case is starting
		// get number of rows of data
		// get all column data
		// extract 
		
		// int where the test starts
		
		Object[][] testData = null;
		int testStartNum = 1;
		int currtestrowNum = 1;
		int maxtestDataRowNum = 0;
		int maxtestDataColNum = 0;
		Hashtable<String,String> table = null;
		
		while(! (xls.getCellData("Data", 0, testStartNum).equals(testCase))){ //Sheet name
			
			testStartNum++;
		}
		
		//@@@@@@@@@@ Holds the starting row number of test Data in the data sheet @@@@@@@@@@@@@//
		currtestrowNum = testStartNum+1;
		
		System.out.println("Test data header starts on row "+(testStartNum));

		
		while(! (xls.getCellData("Data",maxtestDataColNum, testStartNum+1).equals(""))){
			maxtestDataColNum++;
		}
		
		System.out.println("Number of columns for "+testCase+" is "+maxtestDataColNum);
		
		while(! (xls.getCellData("Data", 0, currtestrowNum+1).equals(""))){
			maxtestDataRowNum++;
			currtestrowNum++;
		}
		
		System.out.println("Number of data rows for "+testCase+" is "+maxtestDataRowNum);
		
		testData = new Object[maxtestDataRowNum][1];
		
		//iterate over rows
		
		int index = 0;
		
		for(int row = 1 ; row <=  maxtestDataRowNum ; row++ ){
			
			table = new Hashtable<String,String>();
			
			for(int col = 0; col < maxtestDataColNum; col++ ){
				
				String key = xls.getCellData("Data", col, testStartNum+1);
				String value = xls.getCellData("Data", col, testStartNum+1+row);
				table.put(key, value);
			
			}
			
			testData[index][0] = table;
			index ++;
				
		}
		
		return testData;
	}
	
	public static String getRunmode(String testCaseName , ReadExcel xls){
	
		int row = 1; //This is the starting row in the TestCases sheet.
		int testCaseTotalNum = 0;
		
		while(! (xls.getCellData("TestCases", "TCID", row).equals(""))){
			
			row++;
			testCaseTotalNum++;
		}
		
		// By the end of above loop, we have the total number of test cases
		
		String currTestCaseName = null;
		String currTestCaseRunMode = null;
		
		for (row = 2; row <= testCaseTotalNum; row++ )
		{
			
			 currTestCaseName = xls.getCellData("TestCases", "TCID", row);
			 currTestCaseRunMode = xls.getCellData("TestCases", "Runmode", row);
			
			
			if (currTestCaseName.equalsIgnoreCase(testCaseName)){
				//System.out.println("the runmode for testcase "+currTestCaseName+" is "+currTestCaseRunMode);

				 return currTestCaseRunMode;

			}
		}
		
		System.out.println(" ERROR: the testcase "+currTestCaseName+" was not found");
		return "NF";
	}

	// gets the current test case data rom row#
	public static int getCurrentTestCaseDataRow(String testCaseName , ReadExcel xls , String currentTestDataDataRow){
			
			int testStartrowNum = 0;
			while(! (xls.getCellData("Data", 0, testStartrowNum).equalsIgnoreCase(testCaseName))){
				
				testStartrowNum++;
			}
			
			//add 1 because the data start in the next row after the test case name
			testStartrowNum = testStartrowNum+1;
			
			System.out.println("test case starts on row"+(testStartrowNum));
			
			//currentTestDataDataRow = DataMap.getkey("")
			testStartrowNum = testStartrowNum + Integer.parseInt(currentTestDataDataRow);
			
			return testStartrowNum;
		}
		// gets the row that has the data header values
	public static int getTestCaseDataHeaderRow(String testCaseName , ReadExcel xls){
	
	int testStartrowNum = 0;
	while(! (xls.getCellData("Data", 0, testStartrowNum).equalsIgnoreCase(testCaseName)))
	{
		
		testStartrowNum++;
	}
	
	testStartrowNum = testStartrowNum+1;
	
	//System.out.println("test case starts on row"+(testStartrowNum));
	return testStartrowNum;
}

}
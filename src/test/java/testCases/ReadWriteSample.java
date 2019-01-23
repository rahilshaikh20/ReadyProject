package testCases;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import HairAdvisor.BrowserFactory;
import utilities.ExcelData;

public class ReadWriteSample {
	
	BrowserFactory bf=new BrowserFactory();
	ExcelData write=new ExcelData();
	
  @Test(dataProvider = "getData")
  public void Testcase1(Hashtable<String, String> testData)  throws Exception
  {
	  List<ExcelData> DataLst = new ArrayList<ExcelData>();
	  write.setBrowser(testData.get("browser")); //Get the values of Header names to be used
	  write.setName(testData.get("name"));//Get the values of Header names to be used
	  DataLst.add(write);
	  dataoutput(DataLst);
  }

  @DataProvider
  public Object[][] getData() throws IOException {
	  
	  return bf.getExcelData("Testcase2", "Testdata.xlsx"); //Excel name and test set present in data
	 
  }
  
 //Method to create cells open the excel and write to file. Can be created under utilities as well.
  public void dataoutput(List<ExcelData> Data) throws IOException 
  {
		FileInputStream fIPS = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\resources\\" + "TestData.xlsx");//output sheet name and location
		XSSFWorkbook wb = new XSSFWorkbook(fIPS);
		XSSFSheet worksheet = wb.getSheet("output");//Output Sheet name 
		int a = worksheet.getLastRowNum();
		XSSFRow col = null;
		XSSFCell cell0 = null;
		XSSFCell cell1 = null;
		
		for (ExcelData record : Data)
		{
			col = worksheet.createRow(++a);
			cell0 = col.createCell(0);
			cell1 = col.createCell(1);
			cell0.setCellValue(record.getName()); //Setting the cell values in output excel
			cell1.setCellValue(record.getBrowser());
		}
		
		fIPS.close();
		FileOutputStream fileOut = new FileOutputStream(System.getProperty("user.dir") + "\\src\\main\\resources\\" + "Testdata.xlsx");
		wb.write(fileOut);
		fileOut.close();
		wb.close();

	}
}

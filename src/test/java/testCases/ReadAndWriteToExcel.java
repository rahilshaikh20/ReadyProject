package testCases;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Properties;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xerces.impl.xpath.XPath;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import HairAdvisor.BrowserFactory;
import utilities.ExcelData;

public class ReadAndWriteToExcel {
	
	BrowserFactory bf=new BrowserFactory();
	ExcelData write=new ExcelData();
	WebDriver driver;
	Properties prop = null;
	
  @Test(dataProvider = "getData") ///comment
  public void Testcase1(Hashtable<String, String> testData)  throws Exception
  
  {  
	  driver= bf.loadDriver();
	  prop= bf.loadproperties();
	  bf.loadURL();
	  
	  driver.findElement(By.name("q")).sendKeys(testData.get("name"));//Use the header from excel to input values
	
	  Thread.sleep(3000);
	  driver.findElement(By.name("q")).sendKeys(Keys.TAB);//Use the header from excel to input values
	  
	  
	  driver.findElement(By.xpath("(//*[@name='btnK'])[2]")).click();
	  
	  String str=driver.getTitle(); //Save the output to be written in the string
	  driver.quit();		  
	  
	  List<ExcelData> DataLst = new ArrayList<ExcelData>();
	  write.setBrowser(str); //Get the output to be written in Browser column
	  write.setDataRow(testData.get("datarow")); //Get the datarow to be written from the input sheet for mapping
	  write.setName(str); //Get the output to be written in Name column
	  
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
		XSSFCell cell2 = null;
		
		for (ExcelData record : Data)
		{
			col = worksheet.createRow(++a);
			cell0 = col.createCell(4);
			cell1 = col.createCell(5);
			cell2 = col.createCell(7);
			
			cell0.setCellValue(record.getDataRow());
			cell1.setCellValue(record.getName());
			cell2.setCellValue(record.getBrowser());
		}
		
		fIPS.close();
		FileOutputStream fileOut = new FileOutputStream(System.getProperty("user.dir") + "\\src\\main\\resources\\" + "Testdata.xlsx");
		wb.write(fileOut);
		fileOut.close();
		wb.close(); //close the file

	}
}

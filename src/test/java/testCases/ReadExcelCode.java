package testCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class ReadExcelCode  {

	  	
		  
	    public void readExcel(String filePath,String fileName,String sheetName) throws IOException{

	    	
	    //Create an object of File class to open xlsx file

	    File file =    new File(filePath+"\\"+fileName);

	    //Create an object of FileInputStream class to read excel file

	    FileInputStream inputStream = new FileInputStream(file);

	    Workbook guru99Workbook = null;

	    //Find the file extension by splitting file name in substring  and getting only extension name

	    String fileExtensionName = fileName.substring(fileName.indexOf("."));

	    //Check condition if the file is xlsx file

	    if(fileExtensionName.equals(".xlsx")){

	    //If it is xlsx file then create object of XSSFWorkbook class

	    guru99Workbook = new XSSFWorkbook(inputStream);

	    }

	    //Check condition if the file is xls file

	    else if(fileExtensionName.equals(".xls")){

	        //If it is xls file then create object of XSSFWorkbook class

	        guru99Workbook = new HSSFWorkbook(inputStream);

	    }

	    //Read sheet inside the workbook by its name

	    Sheet sheet = guru99Workbook.getSheet(sheetName);
	    
	   // cell.setCellType(Cell.CELL_TYPE_STRING);

	    //Find number of rows in excel file
	    
	    int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
	    
	    System.out.println(sheet.getFirstRowNum());
	    System.out.println(sheet.getLastRowNum());
	    
	    Row index = sheet.getRow(0);
	   
	    
	    //Create a loop over all the rows of excel file to read it

	    for (int i = sheet.getFirstRowNum(); i <= sheet.getLastRowNum(); i++) {

	        Row row = sheet.getRow(i);
	        
	        
	       //Create a loop to print cell values in a row

	        for (int j = 0; j < row.getLastCellNum(); j++) {

	            //Print Excel data in console
	        	
	        	//row.getCell(j).setCellType(Cell.CELL_TYPE_STRING);
	        			
		    	//int type = row.getCell(j).getCellType();////Get the type of value saved in the cell (int OR string)
	        	
	        	/*if ( type == Cell.CELL_TYPE_NUMERIC)
	        	{
	        		int val=(int) row.getCell(j).getNumericCellValue();
	        		System.out.print(val+" || ");
	        	}
	        	
	        	
	        	else*/
	        
	        		String data=row.getCell(j).getStringCellValue();
	        		System.out.print(data+" || ");   

	        }

	        System.out.println();
	    } 

	    }  

	    //Main function is calling readExcel function to read data from excel file

	    public static void main(String...strings) throws IOException{

	    //Create an object 

	    	 ReadExcelCode  objExcelFile = new ReadExcelCode();

	    //Prepare the path of excel file

	    String filePath = System.getProperty("user.dir")+"\\src";

	    //Call read file method of the class to read data

	    objExcelFile.readExcel(filePath,"SampleExcel.xlsx","Sheet1");

	    }

	}



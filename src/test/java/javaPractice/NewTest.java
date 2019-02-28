package javaPractice ;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Hashtable;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class NewTest  {

		public void readExcel(String filePath,String fileName,String sheetName) throws IOException{

	    File file =    new File(filePath+"\\"+fileName);
	    FileInputStream inputStream = new FileInputStream(file);
	    Workbook guru99Workbook = null;
	    String fileExtensionName = fileName.substring(fileName.indexOf("."));
	    if(fileExtensionName.equals(".xlsx")){
	    guru99Workbook = new XSSFWorkbook(inputStream);

	    }

	    else if(fileExtensionName.equals(".xls")){
	    	guru99Workbook = new HSSFWorkbook(inputStream);
	    }

	    Sheet sheet = guru99Workbook.getSheet(sheetName);
	    String[][] data = new String[5][5];
	    
	    for (int i = sheet.getFirstRowNum(); i <= sheet.getLastRowNum(); i++) {
    	
	        Row row = sheet.getRow(i);
	
	        for (int j = 0; j < row.getLastCellNum(); j++) {

	         		/*String key =index.getCell(j).getStringCellValue();
	        		String value =row.getCell(j).getStringCellValue();
	        
	        		table.put(key, value);*/
	        	
	        	//System.out.print(row.getCell(j).getStringCellValue()+ " || ");
	        	
	        	data [i][j]  = row.getCell(j).getStringCellValue();
	        	
	        	
	        }
	             
			//System.out.println();
	    } 

	    for (String[] u: data) {
			
	    	for (String elem: u) {
				System.out.print(elem +" || " );
	    		
			}
	    	System.out.println();
		}
	    
	   
	   
	 /*   System.out.print(data [0][0] + "|");
	    System.out.println(data [0][1] + "|");
	   	*/
	    
	   
	    }  

	

	    public static void main(String...strings) throws IOException{

	    	 NewTest  objExcelFile = new NewTest();

	    	 String filePath = System.getProperty("user.dir")+"\\src";

	    	 objExcelFile.readExcel(filePath,"SampleExcel.xlsx","Sheet1");

	    }

	}



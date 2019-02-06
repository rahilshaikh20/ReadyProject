package javaPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
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

public class PracticeJava {

	
	int recursion(int n)
	{
		int result;
		
	if ( n ==1) 
		return 1;
			
			result=recursion (n-1) * n;
			System.out.println(result);
							
		return result;
		
	}
	
	int fact (int num)
	
	{
		int result=1;
		
		do{
			 result= result*num;
            num--;
                       
       }while(num>0);
		
		return result;
		
	}
		
	
public static void main(String[] args) throws IOException

{
	
	PracticeJava pj = new PracticeJava();
	System.out.println(pj.recursion(5));
	
	//System.out.println(pj.fact(5));
	
	try {
		
		int a=5;
		int b=a/0;
		
	}
	
	catch (Exception e)
	{
		System.out.println(e);
	}
	
	
	finally {
		// TODO: handle finally clause
		System.out.println("this will always be printed");
		System.out.println(System.getProperty("user.dir"));
	
		
	}
		
}


}

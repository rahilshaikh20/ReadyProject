package javaPractice;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.codehaus.groovy.ast.stmt.TryCatchStatement;
import org.testng.annotations.BeforeTest;

public class SampleTest 
{

	public static void main(String[] args) throws Exception {
		

		try
		{
			badMethod();
			System.out.println("A");
			
		}
		catch(Exception e)
		{
			System.out.println("B");
			
		}
		finally
		{
			System.out.println("C");
		}
		System.out.println("D");
		
	}
	
	public static void badMethod() {}

}

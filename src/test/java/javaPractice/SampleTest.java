package javaPractice;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

public class SampleTest 
{
	
	int result;
	

int fact(int n)

{
	if(n==1)
	return 1;	
		
	result=n*fact(n-1);
		
	return result;

}


public static void main(String[] args) {
	
	
	SampleTest a = new SampleTest();
	
	System.out.println(a.fact(6));
	
}



}
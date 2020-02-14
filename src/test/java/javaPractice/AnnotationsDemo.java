package javaPractice;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsDemo {

		@Test
		public void TC_0002() 
		{
			System.out.println("***Test1****");
		}
		@Test
		public void TC_0002w() 
		{
			System.out.println("***Test2****");
		}
			
		@BeforeSuite
		public void TC_00021() 
		{
			System.out.println("***BeforeSuite****");
		}
		
		@BeforeTest
		public void TC_0001() 
		{
			System.out.println("***BeforeTest****");
		}
		
		@BeforeClass
		public void TC_00s01() 
		{
			System.out.println("***BeforeClass****");
		}
		@BeforeMethod
		public void TC_00ss01() 
		{
			System.out.println("***BeforeMethod****");
		}
		
		@AfterSuite
		public void TC_000621() 
		{
			System.out.println("***@AfterSuite****");
		}
		
		@AfterTest
		public void TC_50001() 
		{
			System.out.println("***@AfterTest****");
		}
		
		@AfterClass
		public void TC_4400s01() 
		{
			System.out.println("***@AfterClass****");
		}
		@AfterMethod
		public void TC_030ss01() 
		{
			System.out.println("***@AfterMethod****");
		}
}

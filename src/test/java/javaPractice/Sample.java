package javaPractice;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample {

		@Test
		public void TC_0002() throws IOException 
		{
			try {
				Assert.assertTrue(true);
				System.out.println(System.getProperty("user.dir") );
			}
			catch (Exception e) {
				System.out.println("print this");
			}
			
		}

}

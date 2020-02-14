package javaPractice;

import java.util.List;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import org.testng.annotations.Test;

public class TC004 {
	
	 static int count=0;
	
	{
		count++;
	}
	
	public static <T> List<String> convertArrayToList(String array[]) 
    { 
  
        // Create an empty List 
        List<String> list = new ArrayList<String>(); 
  
        // Iterate through the array 
        for (String t : array) { 
            // Add each element into the list 
            list.add(t); 
        } 
        
        return list;
    }
	public static void main(String[] args) {
				
		List<String> list = new ArrayList<String>(); 
		
		list.add("abc");
		list.add("def");
		list.add("xyz");
		list.add("45");
	
		
		
		for (String val : list) 
		{			
			System.out.println(val);
		}
		
		  // Create an Array 
        String array[] = { "Geeks", "forGeeks", 
                                    "A Computer Portal" }; 
  
        // Print the Array 
        System.out.println("Array: " 
                       + Arrays.toString(array)); 
  
        // convert the Array to List 
        List<String> list1 = convertArrayToList(array); 
        
        for (String val : list1) 
		{			
			System.out.println(val);
		}
		
        
        Object[] str = list.toArray();
        
        for (Object object : str) {
        	System.out.println(object);
			
		}
        
	}
	

}

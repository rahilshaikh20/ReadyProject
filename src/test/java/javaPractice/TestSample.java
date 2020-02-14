package javaPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestSample {
	
	 private int Multiply(int a,int b)
	    {
	        return a*b;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestSample obj = new TestSample();
		int i = obj.Multiply(3, 5);
		
		System.out.println("Ans: "+i);
		

	       Map< Object,Integer> hm = new HashMap< Object,Integer>(); 
	       hm.put("a", new Integer(100)); 
	       hm.put("b", new Integer(200)); 
	       hm.put("c", new Integer(300)); 
	       hm.put("d", new Integer(400)); 
	       hm.put("e", 500);
	       hm.put(5, 600);
	       
	       hm.remove("d");
	       
	      int o= hm.hashCode();
	      
	   // Set<String> set  = hm.keySet();
	       
	       System.out.println(hm.keySet());
	       System.out.println(hm);
	       
		
	}

}

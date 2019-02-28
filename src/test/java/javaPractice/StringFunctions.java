package javaPractice;

import com.gargoylesoftware.htmlunit.util.StringUtils;

public class StringFunctions {

	public static void main(String[] args) {


		String S1 ="This is my place";
		String S2 = "zA gffg";
		
	
		S2.split("g");
		System.out.println(S1.length());
	
		
		/*System.out.println(S1.contains("the best"));
		System.out.println(S1.trim());
		System.out.println(S1.toUpperCase());
		System.out.println(S1.concat(S2));
		System.out.println(S1.getClass());
		*/
			
		
		
		String blogName = "how to do in java and python";
		StringBuilder reverseString = new StringBuilder();
		 
		String[] words = blogName.split(" ");  //step 1
		 
		System.out.println(words.length);
		
		
		//for reversing words in a string
		for (String word : words)
		{
		    String reverseWord = new StringBuilder(word).reverse().toString();      //step 2
		    reverseString.append(reverseWord+ " " );                                //step 3
		}
		 
		System.out.println( reverseString.toString().trim() );
		
		//for reversing sequence of words in a string
		
		for(int i=words.length-1;i>=0;i--)
			
		{
			System.out.print(words[i]+ " ");
		}

}
	}

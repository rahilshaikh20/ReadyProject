package javaPractice;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.testng.annotations.Test;

 public  class TC005 {

public static void main(String[] args) {
	
	Set<String> set = new TreeSet<String>(); 
	
	List<String> list = new ArrayList<String>(); 
	
	list.add("abc");
	list.add("def");
	list.add("xyz");
	list.add("45");
	list.add("xyz");
	list.add("45");
	list.add("axd");
	list.add(3, "989");
	//list.
	
	int i =5;
	//char a=i;
	
	
		/*
		 * for (String value : list) {
		 * 
		 * System.out.print(value+", " );
		 * 
		 * }
		 */
	
	set.addAll(list);
	//System.out.println();
	
System.out.println(set);
System.out.println(list);
}
}

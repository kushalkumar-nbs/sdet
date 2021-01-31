package javaActivity3_2;

import java.util.HashSet;

public class Activity3_2 {

	public static void main(String[] args) {
		
		HashSet <String> hs = new HashSet<String>();
		hs.add("P");
		hs.add("E");
		hs.add("R");
		hs.add("F");
		hs.add("E");
		hs.add("C");
		hs.add("T");
		 System.out.println("Original HashSet: " + hs); 
		 System.out.println("Size of HashSet: " + hs.size());
		 System.out.println("Removing F from HashSet: " + hs.remove("F"));
		 
		 if(hs.remove("Z")) {
	        	System.out.println("Z removed from the Set");
	        } else {
	        	System.out.println("Z is not present in the Set");
	        }
			
	        System.out.println("Checking if P is present: " + hs.contains("P"));
	        //Print updated HashSet
	        System.out.println("Updated HashSet: " + hs);
	}
	

}

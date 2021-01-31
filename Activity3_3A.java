package javaActivity3_3;

import java.util.HashMap;

public class Activity3_3A {

	public static void main(String[] args) {
		HashMap <Integer, String> hashMap= new HashMap<Integer, String>();
		hashMap.put(1, "Red");
		hashMap.put(2, "Blue");
		hashMap.put(3, "Green");
		hashMap.put(4, "Yellow");
		hashMap.put(5, "Black");
		
		System.out.println("Original hashmap is :" + hashMap);
		 hashMap.remove(4);
		 System.out.println("After removing Yellow: " + hashMap);
		 
		  if(hashMap.containsValue("Green")) {
	            System.out.println("Green exists in the Map");
	        } else {
	            System.out.println("Green does not exist in the Map");
	        }
		  System.out.println("Number of key value pair present in map is : " + hashMap.size());
	}

}

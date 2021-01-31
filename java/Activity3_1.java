package javaActivity3_1;

import java.util.ArrayList;

public class Activity3_1 {
public static void main(String[] args) {
	ArrayList <String> myList=  new ArrayList<String>();
	myList.add("Kushal");
	myList.add("Kumar");
	myList.add("Mittal");
	myList.add(3, "John");
	myList.add(1,"Tina");
	System.out.println("Print All the Objects:");
    for(String s:myList){
        System.out.println(s);
    }
    System.out.println("3rd Element in the list is : "+ myList.get(2));
    System.out.println("is kushal in the list: "+ myList.contains("kushal"));
    System.out.println("My Array Size is: "+ myList.size());
}
}

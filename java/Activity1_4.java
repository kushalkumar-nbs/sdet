package javaActivity3;

import java.util.Arrays;

public class Activity1_4 {

	
public static void main(String[] args) {
	int[] numArr = {4, 3, 5, 1, 6, 2, 7, 10, 8, 9};
	sort(numArr);
		System.out.println(Arrays.toString(numArr));
}
	public static void sort(int[] array) {
			for (int i = 1; i < array.length; i++) {
			var current= array[i];
			var j=i-1;
			while(j>=0 && array[j]>current) {
				
				array[j+1]= array[j];
				j--;
			}
			array[j+1]= current;
						
		}
	}
	
}

//}

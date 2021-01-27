package javaActivity2;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr = {10, 77, 10, 54, -11, 10};
		int sum = 0;
		for (int i  = 0;  i < numArr.length; i++) {
			if (numArr[i]==10) {
				sum = sum+ numArr[i];
				
			}
			}
			
			if	(sum> 30) {
			System.out.println(false);
			}
			else if(sum==30) {
			System.out.println(true);
			}
}
}


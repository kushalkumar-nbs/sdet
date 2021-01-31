package javaActivity2_4;

public class javaActivity2_4 {

	public static void main(String[] args) {
		try {
            javaActivity2_4.exceptionTest("Will print to console");
            javaActivity2_4.exceptionTest(null);
            javaActivity2_4.exceptionTest("Won't execute");
        } catch(CustomException mae) {
            System.out.println("Inside the catch block: " + mae.getMessage());
        }

	}
	
	 static void exceptionTest(String str) throws CustomException {
	        if(str == null) {
	            throw new CustomException("String value is null");
	        } else {
	            System.out.println(str);
	        }
	    }
}

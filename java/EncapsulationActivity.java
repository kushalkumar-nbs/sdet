package javaActivity2_2;

public class EncapsulationActivity {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Plane plane = new Plane(10);
		plane.onboard("Tina");
		plane.onboard("james");
		plane.onboard("john");
		plane.onboard("Kushal");
		plane.onboard("Ram");
		
		System.out.println("Plane took off :" + plane.takeOff());
		System.out.println("Pepole on plane :" +plane.getPassengers());
		Thread.sleep(5000);
		plane.land();
		System.out.println("Plane landed at :" + plane.getLastTimeLanded());
		System.out.println("Pepole on plane after landing :" + plane.getPassengers());
	}

}

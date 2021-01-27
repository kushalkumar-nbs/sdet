package sessionJava;

public class Car {

	String color;
	String transmission;
	int make;
	int tyers;
	int doors;
	Car(){
		doors = 4;
		tyers= 4;
	}
	
	public void displayCharacteristics() {
		System.out.println("Colour of car is: " + color);
		System.out.println("Trasmission is: "+ transmission);
		System.out.println("Make of car is : "+ make);
		System.out.println("Tyers are: " + tyers);
		System.out.println("Doors are :" + doors);
	}
	
	public void accelarate() {
		System.out.println("Car is moving forward.");
		
	}
	public void brake() {
		System.out.println("Car has stopped.");
	}
}

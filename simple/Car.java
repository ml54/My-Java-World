package project8;

public class Car extends Vehicle {
	String gear;
	void print() {
		System.out.println(gear);
		
	}
	Car(String name, String color,int speed, String gear){
		super(name,color,speed);
		this.gear = gear;
		
		System.out.println("car");
		
	}

}

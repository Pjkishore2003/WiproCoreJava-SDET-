package labsession;
class Vehicle {
 protected String brand;

 public Vehicle(String brand) {
     this.brand = brand;
 }

 public void start() {
     System.out.println(brand + " vehicle is starting");
 }
}

class Car extends Vehicle {
 public Car(String brand) {
     super(brand);
 }

 public void drive() {
     System.out.println(brand + " car is driving");
 }
}

class SportsCar extends Car {
 public SportsCar(String brand) {
     super(brand);
 }

 public void turboBoost() {
     System.out.println(brand + " sports car is using turbo boost!");
 }
}

public class MultiLevelInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	SportsCar ferrari = new SportsCar("Ferrari");
	
	     ferrari.start();        // From Vehicle
	     ferrari.drive();        // From Car
	     ferrari.turboBoost();
	}
}

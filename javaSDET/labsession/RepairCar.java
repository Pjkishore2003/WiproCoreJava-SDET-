package labsession;
//Vehicle.java
class Vehicle {
	public void drive() {
     System.out.println("Driving a vehicle");
 }
}

//Car.java
class Car extends Vehicle {
 @Override
 public void drive() {
     System.out.println("Repairing a car");
 }
}

public class RepairCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Vehicle myVehicle = new Vehicle();
	     myVehicle.drive(); // Output: Driving a vehicle
	
	     Car myCar = new Car();
	     myCar.drive(); // Output: Repairing a car
	
	     // Polymorphism demonstration
	     Vehicle v = new Car();
	     v.drive(); 
	}

}

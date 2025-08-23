package labsession240425;

abstract class Vehicle {
 public abstract void move();
}
class Car extends Vehicle {
 //Override
 public void move() {
     System.out.println("Car is moving on four wheels.");
 }
}
class Bike extends Vehicle {
 //Override
 public void move() {
     System.out.println("Bike is moving on two wheels.");
 }
}
class Bus extends Vehicle {
 //Override
 public void move() {
     System.out.println("Bus is moving on four wheels.");
 }
}
public class VehicleAbs {
 public static void main(String[] args) {
     Vehicle car = new Car();
     Vehicle bike = new Bike();
     Vehicle bus = new Bus();
     car.move();  
     bike.move();  
     bus.move();   
 }
}

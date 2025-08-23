package labsession;

//Abstract class
abstract class Employee {
 String name;
 int id;

 // Constructor
 public Employee(String name, int id) {
     this.name = name;
     this.id = id;
 }

 // Abstract method
 public abstract double calculateSalary();

 // Common method to display employee info
 public void displayInfo() {
     System.out.println("Name: " + name);
     System.out.println("ID: " + id);
 }
}

//Subclass for permanent employee
class PermanentEmployee extends Employee {
 private double monthlySalary;

 public PermanentEmployee(String name, int id, double monthlySalary) {
     super(name, id);
     this.monthlySalary = monthlySalary;
 }

 @Override
 public double calculateSalary() {
     return monthlySalary;
 }
}

//Subclass for contract employee
class ContractEmployee extends Employee {
 private double hourlyRate;
 private int hoursWorked;

 public ContractEmployee(String name, int id, double hourlyRate, int hoursWorked) {
     super(name, id);
     this.hourlyRate = hourlyRate;
     this.hoursWorked = hoursWorked;
 }

 @Override
 public double calculateSalary() {
     return hourlyRate * hoursWorked;
 }
}

//Main class to run the program
public class Main {
 public static void main(String[] args) {
     // Create permanent employee
     Employee emp1 = new PermanentEmployee("Alice", 101, 50000.0);
     emp1.displayInfo();
     System.out.println("Salary: ₹" + emp1.calculateSalary());
     System.out.println();

     // Create contract employee
     Employee emp2 = new ContractEmployee("Bob", 202, 500.0, 100);
     emp2.displayInfo();
     System.out.println("Salary: ₹" + emp2.calculateSalary());
 }
}


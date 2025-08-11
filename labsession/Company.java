package labsession;
class Employee {
 public void work() {
     System.out.println("Employee is working");
 }

 public double getSalary() {
     return 30000.00; 
 }
}

//HRManager.java
class HRManager extends Employee {

 public void work() {
     System.out.println("HR Manager is managing HR tasks");
 }

 public void addEmployee() {
     System.out.println("New employee added by HR Manager");
 }
}


public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Employee emp = new Employee();
	     emp.work();  
	     System.out.println("Salary: $" + emp.getSalary());
	
	     // Subclass object
	     HRManager hr = new HRManager();
	     hr.work();          
	     System.out.println("Salary: $" + hr.getSalary()); 
	     hr.addEmployee();   

	     Employee empRef = new HRManager();
	     empRef.work();      
	     System.out.println("Salary: $" + empRef.getSalary());
	}

}

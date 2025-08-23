package pack4;

class Emp {
    private String name;
    private int id;
    private double salary;

    // Constructor
    public Emp(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        setSalary(salary);
    }
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary must be positive for " + name + ". Setting salary to ₹0.");
            this.salary = 0;
        }
    }
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: ₹" + salary);
    }
}
	public class EmpMain {
	    public static void main(String[] args) {
	        Emp emp1 = new Emp("Kishore", 101, 30000);
	        Emp emp2 = new Emp("Jyothi", 102, -5000);  
	        Emp emp3 = new Emp("Prema", 103, 1300); 
	        emp1.displayDetails();
	        emp2.displayDetails();
	        emp3.displayDetails();
	    }
	}



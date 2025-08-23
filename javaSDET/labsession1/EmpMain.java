package labsession240425;

public class EmpMain {
	    public static void main(String[] args) {
	        AbsEmployee emp1 = new PermanentEmp("kishore", 101, 50000.0);
	        emp1.displayInfo();
	        System.out.println("Salary: ₹" + emp1.calculateSalary());
	        System.out.println();
	        AbsEmployee emp2 = new ContractEmployee("Pj", 202, 500.0, 100);
	        emp2.displayInfo();
	        System.out.println("Salary: ₹" + emp2.calculateSalary());
	    }
	}
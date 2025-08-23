package company;


// Subclass of Employee
class manager extends employee {

    public void displayInfo() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Department: " + employeeDepartment);
    }

	public static void main(String[] args) {
        manager mgr = new manager();

        mgr.setEmployeeData("kishore", "emp001", "health");

        mgr.displayInfo();
    }

}

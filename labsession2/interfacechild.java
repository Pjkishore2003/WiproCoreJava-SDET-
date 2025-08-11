package labsession250725;

public class interfacechild implements interface1 {
	public void display() {
		System.out.println("Displaying in child class");
		
	}
	public static void main(String[]args) {
		interfacechild obj = new interfacechild();
		obj.display();
		interface1.write();
		obj.show();
		System.out.println(employeename);
		System.out.println(employeeId);
	}
	

}

package labsession250725;

public class interfacechild2 implements interface2,interface2i {
	public void display() {
		System.out.println("Displaying in child class");
		
	}
	public static void main(String[]args) {
		interfacechild obj = new interfacechild();
		obj.display();
		interface2.write();
		obj.show();
		System.out.println(employeename);
		System.out.println(employeeId);
	}
	

}

package pack1;

public class class1 {
	private static String employeesalary = "98765";
	private void fetchsalary() {
		System.out.println("employeesalary is " + employeesalary);
	}
	public void display() {
		System.out.println("haha you see it");
	}
	int empid = 98765;
	void fetchempid() {
		System.out.println("his id is " + empid );
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class1 obj = new class1();
		obj.display();
		obj.fetchsalary();
		obj.fetchempid();

	}

}

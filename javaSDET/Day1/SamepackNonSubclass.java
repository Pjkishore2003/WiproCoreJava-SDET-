package pack1;

public class SamepackNonSubclass {
	public void write() {
		System.out.println("hahaha again");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class1 obj = new class1();
		SamepackNonSubclass obj1 = new SamepackNonSubclass();
		obj1.write();
		obj.display();

	}

}

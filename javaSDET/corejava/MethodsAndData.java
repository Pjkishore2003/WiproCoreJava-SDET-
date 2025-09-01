package corejava;

public class MethodsAndData {
	public String studentName = "kishore";
	int id = 99;
	public static String branch = "cse";
	
	public void studentdata() {
		char studentgrade = 'A';
		System.out.println(studentName);
		System.out.println(id);
		System.out.println(branch);
		System.out.println(studentgrade);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsAndData md = new MethodsAndData();
		md.studentdata();

	}

}

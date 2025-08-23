package labsession250725;

public interface interface1 {
	abstract void display();
		
	static void write() {
		System.out.println("writing in interface");
	}
	default void show() {
		System.out.println("showing");
	}
	public static final String employeename = "Kishore";
	int employeeId = 4567;
}

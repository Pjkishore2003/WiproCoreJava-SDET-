package corejava;

public class ParameterizedMethod {
	public void add(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParameterizedMethod pm = new ParameterizedMethod();
		pm.add(23, 34);
		pm.add(234, 340);
		pm.add(-876, -98);

	}

}

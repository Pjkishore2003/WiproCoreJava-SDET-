package labsession;

public class MethodOverloading {
	public int add(int a,int b) {
		int c = a + b;
		return c;
	}
	public double add(int a,double b, int c) {
		double d = a + b + c;
		return d;
	}
	public double add(double a,double b, double c,double d) {
		double e = a + b + c + d;
		return e;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading obj = new MethodOverloading();
		System.out.println(obj.add(1,2));
		System.out.println(obj.add(1, 20.9,7));
		System.out.println(obj.add(76.8, 87.4,34.1,63.9));

	}

}

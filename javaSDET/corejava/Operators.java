package corejava;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int A = 10;
	        int B = 20;
	        
	        //unary operators
	        System.out.println(++A);
	        System.out.println(A++);
	        System.out.println(--A);
	        System.out.println(A--);
	        //Arithmetic operators
	        System.out.println(A + B);
	        System.out.println(A - B);
	        System.out.println(A * B);
	        System.out.println(A / B);
	        System.out.println(A % B);
	        
	        //shift operators
	        System.out.println(A << 1);
	        System.out.println(A >> 1);

	        //relational operators
	        System.out.println(A == B);
	        System.out.println(A != B);
	        System.out.println(A > B);
	        System.out.println(A < B);
	        System.out.println(A >= B);
	        System.out.println(A <= B);
	        
	        //logical operators
	        int u = 10 , v = 20;
	        if(u<v && v>15) {
	        	System.out.println("both true");
	        }
	        int age = 23;
	        if(age<18 || age>22) {
	        	System.out.println("true");
	        }
	        
	        boolean firing = false;
	        if(!firing) {
	        	System.out.println("attack");
	        }
	        
	        
	        //ternary operators
	        int a = 20, b = 10, c = 30, result;
	        result = ((a > b) ? (a > c) ? a : c : (b > c) ? b : c);
	        System.out.println(result);

	}

}

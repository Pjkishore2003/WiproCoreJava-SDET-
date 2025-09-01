package labsession;

public class MaximumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b = 150; 
		int c = 19;
		int max;
		if(a>=b && a>=c) {
			max = a;
		}
		else if(b>=a && b>=c) {
			max = b;
		}
		else{
			max = c;
		}
		System.out.println(max);
	}

}

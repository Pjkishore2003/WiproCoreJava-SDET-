package labsession;
import java.util.*;
public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int n = sc.nextInt();
	        sc.close();

	        if (n < 0) {
	            System.out.println("Factorial is not defined for negative numbers.");
	            return;
	        }
	        long fact = 1;
	        for (int i = 2; i <= n; i++) {
	            fact *= i;
	        }

	        System.out.println(n+ fact);
	    }

	}


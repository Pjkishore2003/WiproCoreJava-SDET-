package labsession;
import java.util.*;
public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        int a= 0, b= 1;
        System.out.println("Fibonacci series:");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a+b;
            a = b;
            b = c;
        }
    }

	}


package labsession;
import java.util.*;
public class ForLoopMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();           // User input for which table to print

        System.out.println(num);
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d × %d = %d%n", num, i, num * i);
        }


	}

}

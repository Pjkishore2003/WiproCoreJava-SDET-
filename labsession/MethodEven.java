package labsession;
import java.util.*;
public class MethodEven {
	public static boolean isEven(int num) {
        return num % 2 == 0;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int value = sc.nextInt();
        sc.close();

        if (isEven(value)) {
            System.out.println(value + " is even.");
        } else {
            System.out.println(value + " is odd.");
        }

	}

}

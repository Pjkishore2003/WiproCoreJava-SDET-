package labsession;
import java.util.*;

public class DivisibleOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n%5==0) {
			System.out.println("yes divisible by 5");
		}
		else if(n%11==0) {
			System.out.println("yes divisible by 11");
		}
		else {
			System.out.println("not divisible by both 5 and 11");
		}
		

	}

}

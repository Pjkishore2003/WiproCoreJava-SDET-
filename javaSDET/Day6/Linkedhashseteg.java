package pack6;
import java.util.LinkedHashSet;
public class Linkedhashseteg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.add("papaya");
		lhs.add("mango");
		lhs.add("melon");
		lhs.add("banana");
		System.out.println(lhs);
		System.out.println(lhs.size());
		lhs.remove("melon");
		System.out.println(lhs);
		System.out.println(lhs.isEmpty());

	}

}

package pack6;
import java.util.LinkedList;
public class LinkedListeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> a1 = new LinkedList<>();
		a1.add("peter");
		a1.add("king");
		a1.add("Kishore");
		a1.add("PJ");
		a1.add(null);
		System.out.println(a1);
		System.out.println(a1.get(2));
		System.out.println(a1.indexOf("peter"));
		System.out.println(a1.isEmpty());
		System.out.println(a1.remove(4));
		System.out.println(a1);
		System.out.println(a1.set(4,"king"));
		System.out.println(a1);
		System.out.println(a1.size());

	}

}

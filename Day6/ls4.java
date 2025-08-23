package pack6;
import java.util.LinkedList;
public class ls4 {
	public static void main(String[]args) {
		LinkedList<String> ls1 = new LinkedList<>();
		ls1.add("PJ");
		ls1.add("Kishore");
		ls1.add("java");
		
		LinkedList<String> ls2 = new LinkedList<>();
		ls2.add("PJ");
		ls2.add("Kisore");
		ls2.add("java");
		
		if(ls1.equals(ls2)) {
			System.out.println("List is equal");
		}
		else {
			System.out.println("List is not equal");
		}
		
	}

}

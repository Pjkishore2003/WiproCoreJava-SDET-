package pack6;
import java.util.Set;
import java.util.TreeSet;
public class SetEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> st = new TreeSet<String>();
		st.add("Apple");
		st.add("Grapes");
		st.add("Null");
		st.add("Null");
		st.add("DragonFruit");
		st.add("Kiwi");
		System.out.println(st);
		System.out.println(st.isEmpty());
		System.out.println(st.remove("kiwi"));
		System.out.println(st.size());
		System.out.println(st);
		System.out.println(st.hashCode());

	}

}

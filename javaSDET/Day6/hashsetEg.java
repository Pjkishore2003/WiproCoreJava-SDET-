package pack6;
import java.util.HashSet;
public class hashsetEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<>();
		hs.add("green");
		hs.add("yellow");
		hs.add("blue");
		hs.add("null");
		hs.add("green");
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.clone());
		//System.out.println(hs.clear());
		

	}

}

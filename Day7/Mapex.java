package pack7;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.*;
public class Mapex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String>map = new HashMap<Integer, String>();
		map.put(2, "kishore");
		map.put(null, null);
		map.put(1, "Pj");
		map.put(3, "jyothi");
		map.put(3, "jyothi");
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			Entry entry = (Map.Entry)itr.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

}

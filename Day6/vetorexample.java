package pack6;

import java.util.Vector;
public class vetorexample {
		    public static void main(String[] args) {
		        Vector<String> vector = new Vector<>();
		        vector.add("peter");
		        vector.add("king");
		        vector.add("Kishore");
		        vector.add("PJ");
		        System.out.println(vector);
		        System.out.println(vector.get(2));
		        System.out.println( vector.contains("PJ"));
		        System.out.println(vector.firstElement());
		        System.out.println(vector.lastElement());
		        System.out.println(vector.indexOf("king"));
		        System.out.println(vector.isEmpty());
		    
		}


	}

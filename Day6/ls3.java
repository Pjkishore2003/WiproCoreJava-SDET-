package pack6;
import java.util.ArrayList;
import java.util.Collections;
public class ls3 {
	    public static void main(String[] args) {
	        ArrayList<Integer> num = new ArrayList<>();
	        num.add(15);
	        num.add(22);
	        num.add(8);
	        num.add(39);
	        num.add(39);
	        num.add(13);
	        ArrayList<Integer> unique = new ArrayList<>(new java.util.HashSet<>(num));
	        if (unique.size() < 2) {
	            System.out.println("Not enough numbers");
	        } else {
	            Collections.sort(unique, Collections.reverseOrder());
	            int secondLargest = unique.get(1);
	            System.out.println(num);
	            System.out.println(secondLargest);
	        }
	    }
	}




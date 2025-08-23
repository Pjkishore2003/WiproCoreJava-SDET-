package pack7;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.*;
public class Comparatorsubclass implements Comparator<emp> {
	public int compare(emp e1, emp e2) {
       return e2.name.compareTo(e1.name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<emp> em = new ArrayList<>();
		em.add(new emp(103,"Raj"));
		em.add(new emp(101,"shyam"));
		em.add(new emp(102,"blaze"));
		em.add(new emp(103,"Raj"));
		em.add(new emp(104,"enoch"));
		Collections.sort(em,new Comparatorsubclass());
		for (emp e: em) {
			System.out.println(e);
		}
	
	}

}

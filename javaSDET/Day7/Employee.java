package pack7;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
	public class Employee implements Comparable<Employee> {
	    int id;
	    String name;
	    public Employee(int id, String name) {
	        this.id = id;
	        this.name = name;
	    }
	    public int compareTo(Employee e) {
	        return this.id - e.id;
	    }
	    public String toString() {
	        return id + "_" + name;
	    }
	    public static void main(String[] args) {
	        List<Employee> empList = new ArrayList<>();
	        empList.add(new Employee(203, "kishore"));
	        empList.add(new Employee(201, "PJKISHORE"));
	        empList.add(new Employee(202, "blaze"));
	        //Collections.sort(empList);
	        empList.sort((a, b) -> a.name.compareToIgnoreCase(b.name));
	        for (Employee e : empList) {
	            System.out.println(e);
	        }
	    }
	}
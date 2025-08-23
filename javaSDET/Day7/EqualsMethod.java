package pack7;
import java.util.*;
public class EqualsMethod {
	int id;
	String name;
	 EqualsMethod(int id , String name) {
		this.id = id;
		this.name = name;
	}
	 // Overiding equal () to compare the object content
	 @Override
	 public boolean equals(Object obj) {
		 if (this == obj) return true ; // same reference
		 if(obj == null || getClass()!= obj.getClass()) return false;

		 emp other  = (emp)obj;
		 
		 return this.id == other.id && this.name.equals(other.name);
	 }
	 @Override
	 public int hashCode() {
		 return Objects.hash(id ,name);
	 }
	 @Override
	 public String toString() {
			return id   + "_" + name;
		} 
	public static void main(String[] args) {
		List<emp>  empoyees = new ArrayList<>();
		empoyees.add(new emp (103, "Ravi"));
		empoyees.add(new emp (101, "Amit"));
		empoyees.add(new emp (102, "Zara"));
		empoyees.add(new emp (102, "Zara"));
		empoyees.add(new emp (104, "John"));
		for (emp e: empoyees ) {
			System.out.println(e);
		}
 
 
	}

}

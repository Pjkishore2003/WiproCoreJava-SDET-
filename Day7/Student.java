package pack7;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Student implements Comparable<Student>{
	int rollNum;
	String name;
	public Student(int rollNum, String name) {
		this.rollNum = rollNum;
		this.name = name;
	}
	public int compareTo(Student s) {
		return this.rollNum - s.rollNum;
	}
	public String toString() {
		return rollNum +"_" + name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> st = new ArrayList<>();
		st.add(new Student(103,"kishore"));
		st.add(new Student(101,"PJ"));
		st.add(new Student(102,"blaze"));
		Collections.sort(st);
		//st.sort((a, b) -> a.name.compareToIgnoreCase(b.name));
		for(Student s : st) {
			System.out.println(s);
		}

	}

}

package labsession;

public class GradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks = 85;  
		 
        if (marks >= 90 && marks <= 100) {
            System.out.println("Grade: A");
        } else if (marks >= 75 && marks <= 89) {
            System.out.println("Grade: B");
        } else if (marks >= 60 && marks <= 74) {
            System.out.println("Grade: C");
        } else if (marks >= 40 && marks <= 59) {
            System.out.println("Grade: D");
        } else if (marks < 40 && marks >= 0) {
            System.out.println("Grade: Fail");
        } else {
            System.out.println("Invalid marks!");
        }
    }

	}

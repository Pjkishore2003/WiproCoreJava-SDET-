package labsession240425;
abstract class Student {
 String name;
 int rollNo;
 // Constructor
 public Student(String name, int rollNo) {
     this.name = name;
     this.rollNo = rollNo;
 }
 public abstract String getGrade();
 public void displayInfo() {
     System.out.println("Name: " + name);
     System.out.println("Roll No: " + rollNo);
 }
}
class EnggStudent extends Student {
 private double marks;

 public EnggStudent(String name, int rollNo, double marks) {
     super(name, rollNo);
     this.marks = marks;
 }
 //Override
 public String getGrade() {
     if (marks >= 85) return "A";
     else if (marks >= 70) return "B";
     else return "Fail";
 }
}
class MedStudent extends Student {
 private double marks;

 public MedStudent(String name, int rollNo, double marks) {
     super(name, rollNo);
     this.marks = marks;
 }
 //Override
 public String getGrade() {
     if (marks >= 80) return "A";
     else if (marks >= 65) return "B";
     else return "Fail";
 }
}
public class CollegeAdmission {
 public static void main(String[] args) {
     Student engStudent = new EnggStudent("Pj", 135, 78.5);
     Student medStudent = new MedStudent("Kishore", 134, 45);
     engStudent.displayInfo();
     System.out.println("Grade: " + engStudent.getGrade());
     System.out.println();
     medStudent.displayInfo();
     System.out.println("Grade: " + medStudent.getGrade());
 }
}
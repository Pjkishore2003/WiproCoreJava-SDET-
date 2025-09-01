package college;

public class studentdata {
		private String studentName;
	    private String studentId;
	    private String studentDepartment;

	    public void setStudentData(String name, String id, String department) {
	        this.studentName = name;
	        this.studentId = id;
	        this.studentDepartment = department;
	    }

	    public void displayStudentData() {
	        System.out.println("Student Name: " + studentName);
	        System.out.println("Student ID: " + studentId);
	        System.out.println("Student Department: " + studentDepartment);
	    }
	}

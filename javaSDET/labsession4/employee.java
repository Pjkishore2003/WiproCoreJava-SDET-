package company;

public class employee {
    // Protected data members
    protected String employeeName;
    protected String employeeId;
    protected String employeeDepartment;

    // Public method to set data
    public void setEmployeeData(String name, String id, String department) {
        employeeName = name;
        employeeId = id;
        employeeDepartment = department;
    }
}

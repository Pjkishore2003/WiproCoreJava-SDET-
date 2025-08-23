package customers;

public class customer {
    protected String customerName;
    protected String customerId;
    protected String customerDepartment;

    public void setCustomerData(String name, String id, String department) {
        this.customerName = name;
        this.customerId = id;
        this.customerDepartment = department;
    }

    protected void displayCustomerData() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Customer Department: " + customerDepartment);
    }
}

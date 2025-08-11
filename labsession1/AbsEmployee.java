package labsession240425;

abstract class AbsEmployee {
    String name;
    int id;

    // Constructor
    public AbsEmployee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Abstract method
    public abstract double calculateSalary();

    // Common method to display employee info
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}
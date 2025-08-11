package labsession240425;

class PermanentEmp extends AbsEmployee {
    private double monthlySalary;

    public PermanentEmp(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

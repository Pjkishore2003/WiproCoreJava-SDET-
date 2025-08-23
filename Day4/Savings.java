package pack4;

public class Savings implements Account {
	private double balance = 0;
    private final double interestRate = 0.04; // 4%

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount);
        } else {
            System.out.println("Insufficient balance in Savings Account.");
        }
    }

    @Override
    public double calculateinterest() {
        return balance * interestRate;
    }

    @Override
    public void viewbalance() {
        System.out.println(balance);
    }
    public void applyInterest() {
        double interest = calculateinterest();
        balance += interest;
        System.out.println(interest);
    }
}
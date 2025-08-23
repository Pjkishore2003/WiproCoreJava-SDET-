package labsession240425;

abstract class BankAccount {
    protected String accountNumber;
    protected double balance;

    // Constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Abstract method
    public abstract double calculateInterest();

    // Method to print balance
    public void printBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: ₹" + balance);
    }
}

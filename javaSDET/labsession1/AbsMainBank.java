package labsession240425;

public class AbsMainBank {
    public static void main(String[] args) {
        BankAccount savings = new AbsSavingsAccount("SA123", 10000.0);
        BankAccount fixed = new FixedDepositAccount("FD456", 50000.0);

        // Display Savings Account
        savings.printBalance();
        System.out.println("Interest: ₹" + savings.calculateInterest());
        System.out.println();

        // Display Fixed Deposit Account
        fixed.printBalance();
        System.out.println("Interest: ₹" + fixed.calculateInterest());
    }
}
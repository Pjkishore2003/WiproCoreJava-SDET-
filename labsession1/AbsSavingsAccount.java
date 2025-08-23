package labsession240425;

class AbsSavingsAccount extends BankAccount {
    private static final double INTEREST_RATE = 0.04; // 4%

    public AbsSavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * INTEREST_RATE;
    }
}
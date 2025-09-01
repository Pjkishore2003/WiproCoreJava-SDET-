package labsession240425;

class FixedDepositAccount extends BankAccount {
    private static final double INTEREST_RATE = 0.065; // 6.5%

    public FixedDepositAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * INTEREST_RATE;
    }
}
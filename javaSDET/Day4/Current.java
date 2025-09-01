package pack4;
public class Current implements Account {
	    private double balance = 0;
	    private double overdraftLimit = 1000;
	    @Override
	    public void deposit(double amount) {
	        balance += amount;
	        System.out.println(amount);
	    }
	    @Override
	    public void withdraw(double amount) {
	        if (amount <= balance + overdraftLimit) {
	            balance -= amount;
	            System.out.println(amount);
	        } else {
	            System.out.println("limit exceeded in Current Account.");
	        }
	    }
	    @Override
	    public double calculateinterest() {
	        return 0;
	    }
	    @Override
	    public void viewbalance() {
	        System.out.println(balance);
	    }
	    public void setOverdraftLimit(double limit) {
	        overdraftLimit = limit;
	        System.out.println(limit);
	    }
	}
package pack4;

class Bank {
	    private List<Account> accounts = new ArrayList<>();

	    public void addAccount(Account account) {
	        Account.add(account);
	        System.out.println("Account added to bank.");
	    }

	    public void showAllBalances() {
	        System.out.println("ALL BANK ACCOUNTS");
	        for (Account acc : Account) {
	            acc.viewbalance();
	        }
	    }
	}
	public class IBank {
	    public static void main(String[] args) {
	        Bank bank = new Bank();
	        Savings sa = new Savings();
	        sa.deposit(1000);
	        sa.applyInterest();
	        sa.withdraw(200);
	        Current ca = new Current();
	        ca.deposit(1500);
	        ca.setOverdraftLimit(2000);
	        ca.withdraw(3000);
	        bank.addAccount(sa);
	        bank.addAccount(ca);
	        bank.showAllBalances();
	    }
	}

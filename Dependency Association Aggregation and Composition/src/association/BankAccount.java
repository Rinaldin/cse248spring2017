package association;

public class BankAccount {
	private String accountName;
	private double balance;
	private final double INTEREST_RATE = 0.015;

	public BankAccount(String accountName, double balance) {
		super();
		this.accountName = accountName;
		this.balance = balance;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getINTEREST_RATE() {
		return INTEREST_RATE;
	}

	@Override
	public String toString() {
		return "BankAccount [accountName=" + accountName + ", balance=" + balance + ", INTEREST_RATE=" + INTEREST_RATE
				+ "]";
	}

}

package association;

public class Player {
	private String name;
	private BankAccount bankAccount; // Player -> BankAccount Association
	private int rollOutcome;			// navigation direction to bankaccount

	// Player -----> Die: dependency
	public Player(String name, BankAccount bankAccount, Die die) {
		super();
		this.name = name;
		this.bankAccount = bankAccount;
		this.rollOutcome = die.roll();
	}
	
	public int getRollOutcome() {
		return rollOutcome;
	}

}

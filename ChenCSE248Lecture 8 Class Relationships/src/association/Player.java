package association;

// The most loose class-relationship
public class Player {
	private String name;
	private BankAccount bankAccount; // association: 
	private int rollOutcome;			// a subset of dependency
							// Player "has a" bankAccount
					// as an instance field

	public Player(String name, BankAccount bankAccount) {
		super();
		this.name = name;
		this.bankAccount = bankAccount;
	}

	public void roll(Die die) { // dependency used as method parameter
		rollOutcome = die.roll();
	}

}

package gameLevels;

public class Level2 implements IAbility{

	@Override
	public void travel() {
		System.out.println("Travel by bike.");
	}

	@Override
	public void handleWeapons() {
		System.out.println("Fight with a knife.");		
	}

	@Override
	public void protect() {
		System.out.println("Wear a shirt.");		
	}
	
	public void justDoIt() {
		travel();
		handleWeapons();
		protect();
	}

}

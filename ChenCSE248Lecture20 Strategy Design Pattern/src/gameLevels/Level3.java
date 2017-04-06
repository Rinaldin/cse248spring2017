package gameLevels;

public class Level3 implements IAbility {

	@Override
	public void travel() {
		System.out.println("Travel by bus.");
	}

	@Override
	public void handleWeapons() {
		System.out.println("0.28 automatic.");
		
	}

	@Override
	public void protect() {
		System.out.println("Wear a body armor");
		
	}

	public void justDoIt() {
		travel();
		handleWeapons();
		protect();
	}
}
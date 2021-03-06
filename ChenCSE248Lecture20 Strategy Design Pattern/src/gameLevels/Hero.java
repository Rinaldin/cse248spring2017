package gameLevels;

public class Hero {
	private IAbility ability;

	public void setAbilityLevel(IAbility ability) {
		this.ability = ability;
	}
	
	public void travel() {
		ability.travel();
	}
	
	public void handleWeapons() {
		ability.handleWeapons();
	}
	
	public void protect() {
		ability.protect();
	}
	
	public void justDoIt() {
		ability.justDoIt();
	}
}

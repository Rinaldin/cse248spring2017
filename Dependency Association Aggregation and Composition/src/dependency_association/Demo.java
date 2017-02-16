package dependency_association;

public class Demo {
	public static void main(String[] args) {
	Die die = new Die();
	Player p = new Player("God", 100, die);
	System.out.println(p.getRollOutcome());
	}
}

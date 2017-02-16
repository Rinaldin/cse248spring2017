package association;

public class Die {
	private int num;
	
	public int roll() {
		return (int)(Math.random() * 6 + 1);
	}

}

package association;

public class Die {
	int num;
	
	public int roll() {
		return (int) (Math.random() * 6 + 1);
	}

}

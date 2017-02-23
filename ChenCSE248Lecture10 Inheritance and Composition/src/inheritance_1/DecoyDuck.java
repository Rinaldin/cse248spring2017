package inheritance_1;

public class DecoyDuck extends Duck {

	@Override
	public void display() {
		System.out.println("Displaying Decoy duck...");
	}
	
	@Override
	public void fly() {
		// do nothing
	}
	
	@Override
	public void quack() {
		// do nothing
	}

}

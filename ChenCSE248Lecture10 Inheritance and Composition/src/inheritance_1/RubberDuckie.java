package inheritance_1;

public class RubberDuckie extends Duck {

	@Override
	public void display() {
		System.out.println("Displaying rubber duckie!");
	}

	@Override
	public void quack() {
		System.out.println("squeak, squeak...");
	}
	
	@Override
	public void fly() {
		// do nothing
	}
}

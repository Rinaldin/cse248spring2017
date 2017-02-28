package interface_2;

public class RedheadDuck extends Duck implements Flyable, Quackable {

	@Override
	public void display() {
		System.out.println("Displaying redhead duck");

	}

	@Override
	public void fly() {
		System.out.println("Redhead duck flying");
	}

	@Override
	public void quack() {
		System.out.println("Redhead duck quacking");
	}

}

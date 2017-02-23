package interface_2;

public class MallardDuck extends Duck implements Flyable, Quackable{

	@Override
	public void display() {
		System.out.println("Displaying Mallard duck");
	}

	@Override
	public void quack() {
		System.out.println("Quack, Quack...");
	}

	@Override
	public void fly() {
		System.out.println("Mallard duck is flying...");
	}

}

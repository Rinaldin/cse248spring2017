package interface_2;

public class RubberDuckie extends Duck implements Quackable{

	@Override
	public void display() {
		System.out.println("Displaying rubber duckie...");
	}

	@Override
	public void quack() {
		System.out.println("Rubber duckie squeak, squeak...");
	}

}

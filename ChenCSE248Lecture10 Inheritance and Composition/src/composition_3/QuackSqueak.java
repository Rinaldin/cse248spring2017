package composition_3;

public class QuackSqueak implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("Squeak, Squeak...");
	}

}

package composition_3;

public class QuackNoWay implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("No Quack...");
	}

}

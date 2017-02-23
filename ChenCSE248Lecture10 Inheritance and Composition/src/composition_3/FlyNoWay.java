package composition_3;

public class FlyNoWay implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("Fly no way...");
	}

}

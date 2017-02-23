package composition_3;

public abstract class Duck {
	// composition
	private FlyBehavior flyBehavior;
	private QuackBehavior quackBehavior;
	
	public void setFlyBehavior(FlyBehavior flyBehavior){
		this.flyBehavior = flyBehavior;
	}
	
	public void setQuackBehavior(QuackBehavior quackBehavior)
	{
		this.quackBehavior = quackBehavior;
	}

	public abstract void display();
	
	public void swim() {
		System.out.println("The duck is swimming...");
	}
}

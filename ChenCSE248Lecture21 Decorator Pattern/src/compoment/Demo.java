package compoment;

public class Demo {

	public static void main(String[] args) {
		ConcreteComponent cc = new ConcreteComponent();
		ConcreteDecoratorEX1 cdex1 = new ConcreteDecoratorEX1();
		cdex1.setComponent(cc);
		cdex1.doJob();
		System.out.println("_________________");
		ConcreteDecoratorEX2 cdex2 = new ConcreteDecoratorEX2();
		cdex2.setComponent(cc);
		cdex2.doJob();
	}

}

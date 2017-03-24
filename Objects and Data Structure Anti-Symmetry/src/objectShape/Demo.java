package objectShape;

public class Demo {
	// easy to add new shape but hard to add new method such as
	// get circumference. To add new method, you need to change 
	// every class to do so
	public static void main(String[] args) {
		Circle c = new Circle(4);
		Rectangle r = new Rectangle(2, 1);
		Square s = new Square(2);
		System.out.println(AreaComputer.getArea(s));
	}

}

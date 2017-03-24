package procduralShapes;
// This is procedural, treating teach class as a data structure
// meaning each class only holds data with behavior
// This is anti-object oriented programming so it is hard to add
// a new shape such as a square but easy to add a new behavior
// such as getCircumference(). One just needs to add into the
// Area class
public class Demo {
	
	public static void main(String[] args) throws Exception {
		Circle c = new Circle(1);
		Rectangle r = new Rectangle(1, 3);
		Area a = new Area();
		System.out.println(a.getArea(c));
	}

}

package objectShape;
//object. Behavior is exposed but data is hidden
public class Rectangle implements IShape{
	private double width;
	private double length;
	
	public Rectangle(double l, double w) {
		width = w;
		length = l;
	}

	@Override
	public double getArea() {
		return width * length;
	}
}

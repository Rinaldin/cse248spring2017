package objectShape;

//object. Behavior is exposed but data is hidden
public class Square implements IShape {
	private double length;

	public Square(double l) {
		length = l;
	}

	@Override
	public double getArea() {
		return length * length;
	}

}

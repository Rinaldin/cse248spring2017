package procduralShapes;

public class Area {
	public double getArea(Object shape) throws Exception {
		if(shape instanceof Circle) {
			Circle c = new Circle(1);
			return Math.PI * c.radius * c.radius;
		} else if(shape instanceof Rectangle) {
			Rectangle r = new Rectangle(1, 2);
			return r.length * r.width;
		} 
		throw new Exception();
	}
}

package enumExample2;

public enum Planet {
	MERCURY(3.3e+23, 2.4e6), VENUS(4.7e24, 6.0e6), EARTH(6.0e24, 6.4e6), MARS(6.4e23, 3.4e6), JUPITER(1.9e27,
			7.1e7), SATURN(5.7e26, 6.0e7);

	private final double mass;
	private final double radius;

	private Planet(double mass, double radius) {
		this.mass = mass;
		this.radius = radius;
	}

	private double mass() {
		return mass;
	}

	private double radius() {
		return radius;
	}
	
	public static final double G = 6.7e-11;
	
	double surfaceGravity(){
		return G * mass / (radius * radius);
	}
	
	double surfaceWeight(double otherMass) {
		return otherMass * surfaceGravity();
	}
}

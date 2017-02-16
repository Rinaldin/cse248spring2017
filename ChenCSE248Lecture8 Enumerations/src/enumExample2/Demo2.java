package enumExample2;

public class Demo2 {

	public static void main(String[] args) {
		if(args.length != 1) {
			System.err.println();
			System.exit(-1);
		}
		
		double earthWeight = Double.parseDouble(args[0]);
		double mass = earthWeight / Planet.EARTH.surfaceGravity();
		for(Planet p : Planet.values()) {
			System.out.printf("Your weight on %s is %5.2f%n", p, 
					p.surfaceWeight(mass));
		}
	}

}

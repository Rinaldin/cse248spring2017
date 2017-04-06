package eager_initialization;

public class Demo {

	public static void main(String[] args) {
		Captain c1 = Captain.makeACaptain();
		System.out.println("Trying to make another captain...");
		Captain c2 = Captain.makeACaptain();
		if(c1 == c2) {
			System.out.println("c1 and c2 are the same instance.");
		}
	}

}

package p1;

public interface Java8Interface1 {
	int i = 0;
	default void hi() {
		System.out.println("Hi");
	}
	
	static void hello() {
		System.out.println("Hello");
	}
	
//	void fly();
}

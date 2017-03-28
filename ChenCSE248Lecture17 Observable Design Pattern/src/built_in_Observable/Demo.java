package built_in_Observable;

public class Demo {

	public static void main(String[] args) {
		Student s = new Student("John", 3.0);
		GpaObserver o1 = new GpaObserver(s);
		s.setGpa(1.0);
		s.setGpa(2.0);
		s.setGpa(3.0);
		System.out.println("Adding another observer: ");
		GpaObserver o2 = new GpaObserver(s);
		s.setGpa(4.0);
		s.deleteObserver(o1);
		System.out.println("First observer is removed: ");
		s.setGpa(10.0);
		
	}

}

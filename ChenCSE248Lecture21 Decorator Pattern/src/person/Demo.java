package person;

public class Demo {

	public static void main(String[] args) {
		
		Student s = new Student("John", "1234", 3.5);
//		Student s = new Student();
		s.doWork();
		System.out.println(s.getName());
		System.out.println("------closed for modification-----------------");
		DecoratedStudent ds = new DecoratedStudent("Jane", "1234", 3.5, 3500.50);
//		DecoratedStudent ds = new DecoratedStudent(s);
//		DecoratedStudent ds = new DecoratedStudent();
		ds.setPerson(s);
		ds.doWork();
		System.out.println(ds.getName());
		System.out.println(ds.toString());
	}

}

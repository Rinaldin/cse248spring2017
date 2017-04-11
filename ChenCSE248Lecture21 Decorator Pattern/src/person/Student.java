package person;

public class Student extends Person {

	private double gpa;
	private String name;
	private String id;
	
	public Student(String name, String id, double gpa) {
//		super(name, id);
		this.gpa = gpa;
		this.name = name;
		this.id = id;
	}

	@Override
	public void doWork() {
		System.out.println("I major in Computer Science.");
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	

}

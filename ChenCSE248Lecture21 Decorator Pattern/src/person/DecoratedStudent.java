package person;

public class DecoratedStudent extends AbstractDecorator {
	public DecoratedStudent(Person person) {
		super(person);
	}

	private String name;
	private String id;
	private double gpa;
	private double tuition;

	public DecoratedStudent(String name, String id, double gpa, double tuition) {
//		super(name, id, gpa, tuition);
		this.name = name;
		this.id = id;
		this.gpa = gpa;
		this.tuition = tuition;
	}
	
	public DecoratedStudent() {};
	
	public void doWork() {
		super.doWork();  // still do the old method
		System.out.println("I major in English."); // now it does additional work as well
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

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public double getTuition() {
		return tuition;
	}

	public void setTuition(double tuition) {
		this.tuition = tuition;
	}

	@Override
	public String toString() {
		return "DecoratedStudent [name=" + name + ", id=" + id + ", gpa=" + gpa + ", tuition=" + tuition + "]";
	}
	
}

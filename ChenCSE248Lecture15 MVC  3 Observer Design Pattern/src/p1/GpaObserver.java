package p1;

public class GpaObserver implements Observer{

	private String name;
	private double gpa;
	private Student student;
	
	public GpaObserver(Subject student){
		this.student = (Student)student;
		this.student.register(this);
		System.out.println("New Observer added (registered)");
		
	}
	@Override
	public void update(String name, double gpa) {
		this.gpa = gpa;
		this.name = name;
		System.out.println(name + ": " + gpa);
	}

}

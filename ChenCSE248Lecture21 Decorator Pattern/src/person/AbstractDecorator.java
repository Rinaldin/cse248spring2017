package person;

public abstract class AbstractDecorator extends Person {
	
//	private double gpa;
//	private double tuition;
	private Person person;
//	
	public AbstractDecorator(Person person) {
		this.person = person;
	}
	
	public AbstractDecorator() {};
	
	public void setPerson(Person person) {
		this.person = person;
	}
	
	@Override
	public void doWork() {
		if(person != null) {
			person.doWork();
		}
	}

}

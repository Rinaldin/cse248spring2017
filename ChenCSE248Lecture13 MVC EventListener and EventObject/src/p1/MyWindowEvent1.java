package p1;

import java.util.EventObject;

public class MyWindowEvent1 extends EventObject {
	private Student student;
	
	public MyWindowEvent1(Object source) {
		super(source);
	}
	
	public MyWindowEvent1(Object source, Student student) {
		super(source);
		this.student = student;
	}
	
	public Student getStudent() {
		return student;
	}
}

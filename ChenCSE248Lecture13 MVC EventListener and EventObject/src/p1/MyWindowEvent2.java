package p1;

import java.util.EventObject;

public class MyWindowEvent2 extends EventObject {
	private Student student;
	
	public MyWindowEvent2(Object source) {
		super(source);
	}
	
	public MyWindowEvent2(Object source, Student student) {
		super(source);
		this.student = student;
	}
	
	public Student getStudent() {
		return student;
	}
}


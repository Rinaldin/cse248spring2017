package p4_event_Listener;

import java.util.EventObject;

public class MyWindowEvent extends EventObject {
	private Student student;
	
	public MyWindowEvent(Object source) {
		super(source);
	}
	
	public MyWindowEvent(Object source, Student student) {
		super(source);
		this.student = student;
	}
	
	public Student getStudent() {
		return student;
	}
}

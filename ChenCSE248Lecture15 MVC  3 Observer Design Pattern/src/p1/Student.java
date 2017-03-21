package p1;

import java.util.ArrayList;

public class Student implements Subject{

	private ArrayList<Observer> observerList;
	private String name;
	private double gpa;
	
	public Student(String name, double gpa) {
		observerList = new ArrayList<>();
		this.name = name;
		this.gpa = gpa;
	}
	@Override
	public void register(Observer o) {
		observerList.add(o);
	}

	@Override
	public void unregister(Observer o) {
		int index = observerList.indexOf(o);
		observerList.remove(index);
		System.out.println("Observer " + (index+1) + " deleted");
	}

	@Override
	public void notifyObserver() {
		for(Observer o : observerList) {
			o.update(name, gpa);
		}
	}
	
	// not required but need here for making changes to name and gpa
	public void setName(String name){
		this.name = name;
	}
	
	public void setGpa(double gpa) {
		this.gpa = gpa;
		notifyObserver();
	}

}

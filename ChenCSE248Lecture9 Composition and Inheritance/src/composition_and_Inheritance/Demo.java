package composition_and_Inheritance;

public class Demo {

	public static void main(String[] args) {
		Person john = new Person("John", "111");
		Person Julie	= new Person("Julie", "222");
		Passenger p1 = new Passenger(john);
		Agent a1 = new Agent(Julie);
		
		
		
	}

}

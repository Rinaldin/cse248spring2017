package robot;

public class App {

	public static void main(String[] args) {
		System.out.println("Facade Design Pattern: ");
		RobotFacade rf1 = new RobotFacade();
		rf1.constructRobot("Iron", "Silver");
		
	}

}

package robot;

public class RobotFacade {
	private RobotMetal rm;
	private RobotColor rc;
	private RobotBody rb;
	
	public RobotFacade() {
		rm = new RobotMetal();
		rc = new RobotColor();
		rb = new RobotBody();
	}
	
	public void constructRobot(String m, String c) {
		System.out.println("\nCreation of the robot starts ...");
		rm.setMetal(m);
		rc.setColor(c);
		rb.createBody();
		System.out.println("Robot ceation ended");
		System.out.println();
		
	}
}

package lazy_Initialization;

public class Captain {
	private static Captain captain;
	
	private Captain() {
		
	}
	
	public static Captain makeACaptain() {
		if(captain == null) {
			captain = new Captain();
			System.out.println("Okay, you made a new captain.");
		} else{
			System.out.println("You already have a captain.");
		}
		return captain;
	}
}

package billPugh;

public class Captain {
	private static Captain captain;

	private Captain() {
	}
	
	private static class SingletonHelper {
		private static final Captain captain = new Captain();
	}
	
	public static Captain makeACaptain() {
		return SingletonHelper.captain;
	}

}

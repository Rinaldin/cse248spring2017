package enumExample1;

public class Demo {

	public static void main(String[] args) {
		EnumApp firstDay = new EnumApp(Day.MONDAY);
		firstDay.tellItLikeItIs();
		EnumApp thirdDay = new EnumApp(Day.WEDNESDAY);
		thirdDay.tellItLikeItIs();
		EnumApp sixthDay = new EnumApp(Day.SATURDAY);
		sixthDay.tellItLikeItIs();
	}

}

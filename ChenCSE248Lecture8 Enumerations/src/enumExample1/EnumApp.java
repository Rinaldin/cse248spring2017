package enumExample1;

public class EnumApp {
	private Day day;

	public EnumApp(Day day) {
		super();
		this.day = day;
	}

	public void tellItLikeItIs() {
		switch (day) {
		case MONDAY:
			System.out.println("Mondays are bad.");
			break;
		case FRIDAY:
			System.out.println("Fridays are better.");
			break;
		case SATURDAY:
		case SUNDAY:
			System.out.println("Weekends are the best.");
			break;
		default:
			System.out.println("MidWeek days are so-so");
			break;
		}
	}
}

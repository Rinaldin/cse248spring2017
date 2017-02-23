package composition;

public class CommunityCollege {
	
	private String name;
	private Instructor instructor1 = new Instructor("Adam", "111");
	private Instructor instructor2 = new Instructor("Eve", "222");
	// composition, representing "is part of" death cycle

}

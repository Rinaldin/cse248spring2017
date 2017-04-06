package choices_1;

public class MyChoice2 implements IChoice{

	@Override
	public void setChoice(String str1, String str2) {
		System.out.println("Choice 2: " + 
				(Integer.parseInt(str1) + Integer.parseInt(str2)));
	}

}

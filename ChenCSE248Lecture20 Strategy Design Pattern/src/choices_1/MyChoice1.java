package choices_1;

public class MyChoice1 implements IChoice {

	@Override
	public void setChoice(String str1, String str2) {
		System.out.println("Choice 1: " + (str1 + str2));
	}

}

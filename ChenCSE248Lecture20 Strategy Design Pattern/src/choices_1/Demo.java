package choices_1;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the first number String: ");
		String str1 = kb.nextLine();
		System.out.println("Enter the second number String: ");
		String str2 = kb.nextLine();
		
		Context context = new Context();
		IChoice ic;
		
		for(int i = 0; i < 2; i++) {
			System.out.println("Enter your choice (1 or 2): ");
			String choice = kb.nextLine();
			if(choice.equals("1")) {
				ic = new MyChoice1();
			} else {
				ic = new MyChoice2();
			}
			context.setChoice(ic);
			context.doThingsBasedOnMyChoice(str1, str2);
		}
		
	}

}

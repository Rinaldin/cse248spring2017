package part0;

import java.util.ArrayList;
import java.util.List;

public class Greetings {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Adam");
		list.add("Bill");
		System.out.println(greeting(list));
	}
	
	public static String greeting(List<String> names) {
		String greeting = "Welcome, ";
		for(String n : names) {
			greeting += n + " ";
		}
		greeting += "!";
		return greeting;
	}

}

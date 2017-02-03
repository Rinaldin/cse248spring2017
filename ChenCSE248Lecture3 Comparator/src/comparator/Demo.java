package comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Demo {

	public static void main(String[] args) {
		Country c1 = new Country("aaa", 100.05);
		Country c2 = new Country("bbb", 100.006);
		Country c3 = new Country("ccc", 200);
		Country[] array = new Country[3];
		array[0] = c1;
		array[1] = c2;
		array[2] = c3;
		
		CountryComparator comp1 = new CountryComparator(); 
		Arrays.sort(array, comp1);
		System.out.println(Arrays.toString(array));
		
		ArrayList<Country> list = new ArrayList<>();
		list.add(c1);
		list.add(c2);
		list.add(c3);
		
		Collections.sort(list, comp1);
	}

}

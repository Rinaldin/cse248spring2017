package comparator;

import java.util.Comparator;

public class CountryComparator implements Comparator<Country>{

	@Override
	public int compare(Country o1, Country o2) {
//		if(o1.getArea() - o2.getArea() > 0) {
//			return 1;
//		}
//		if(o1.getArea() - o2.getArea() < 0) {
//			return -1;
//		}
//		return 0;
		
		int value = Double.compare(o1.getArea(), o2.getArea());
		
		System.out.println(o1.getArea() + " - " + o2.getArea() + " = " + value);
		return value;
	}

}

package temperatureWrapper;

public class Demo {

	public static void main(String[] args) {
		Convert convert = new Convert();
		System.out.println(convert.temperatureConvert(32));
		System.out.println("-----------------------------");
		System.out.println();
		TempConversionWrapper theWrapper = new TempConversionWrapper(convert);
		System.out.println(theWrapper.temperatureConvert(0));
	}

}

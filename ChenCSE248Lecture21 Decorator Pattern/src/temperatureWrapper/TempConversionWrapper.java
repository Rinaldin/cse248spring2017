package temperatureWrapper;

public class TempConversionWrapper extends AbstractDecorator{

	public TempConversionWrapper(TemperatureConversion temp) {
		super(temp);
	}
	
	public double temperatureConvert(double temp) {
		return 30 * temp + 32;
	}

}

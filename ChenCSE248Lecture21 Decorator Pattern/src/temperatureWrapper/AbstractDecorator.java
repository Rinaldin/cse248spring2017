package temperatureWrapper;

public abstract class AbstractDecorator implements TemperatureConversion {
	
	private TemperatureConversion tc;
	
	public AbstractDecorator(TemperatureConversion temp) {
		tc = temp;
	}
	
	public double temperatureConvert(double temp) {
		return tc.temperatureConvert(temp);
	}

}

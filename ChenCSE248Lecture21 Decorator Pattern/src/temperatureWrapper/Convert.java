package temperatureWrapper;

public class Convert implements TemperatureConversion {

	@Override
	public double temperatureConvert(double temp) {
		
		return (temp - 32) * 0.5556 ;
	}

}

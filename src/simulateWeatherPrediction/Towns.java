package simulateWeatherPrediction;

/**
 * Симулация на метеорологична обстановка
 * 
 * Да се реализира симулация на метеорологичната обстановка в 10 града в
 * страната за 24-часов период.
 * 
 * Програмата да симулира измервания на температурата (в градуси по Целзий),
 * количество на валежите (в милиметри), сила на вятъра (в метри в секунда) и
 * посока на вятъра (изток, запад, север или юг). Измерванията се генерират с
 * псевдо-случайни (random) стойности за измерваните величини.
 * 
 * За симулацията на един 24-часов период да се генерират 24 последователни
 * измервания - по едно за всеки град, като не е необходимо те да се случват в
 * реално време.
 * 
 * Измерените стойности да се съхраняват в подходяща колекция, като се реализира
 * следната функционалност:
 * 
 * - извличане на всички измервания за всички градове - извличане на
 * измерванията по зададено име на град - извличане на град с
 * максимална/минимална стойност на температура
 * 
 * Да се демонстрира функционалността на програмата като:
 * 
 * 1. стартира се симулацията, която генерира данните 2. отпечатват се всички
 * градове и съответните измерени величини 3. отпечатват се измерванията по
 * предварително зададено име на град, например Варна 4. отпечатва се името на
 * града, с максимална/минимална температура
 * 
 * @author kanastasov
 *
 */
public class Towns {

	private double temperatureCelsius;

	/*
	 * @param rainQuantity stores the quantity of the rain in milimeters.
	 */
	private double rainQuantity;

	/*
	 * в метри в секунда
	 */
	private double windPower;

	private String windDirection;

	private String towns;
	
	public Towns ()
	{
		
	}
	
	public Towns (double temperatureCelsius, double rainQuantity, double windPower, String windDirection, String towns)
	{
		this.temperatureCelsius = temperatureCelsius;
		this.rainQuantity = rainQuantity;
		this.windPower = windPower;
		this.windDirection = windDirection;
		this.towns = towns;
	}

	public double getTemperatureCelsius() {
		return temperatureCelsius;
	}

	public void setTemperatureCelsius(double temperatureCelsius) {
		this.temperatureCelsius = temperatureCelsius;
	}

	public double getRainQuantity() {
		return rainQuantity;
	}

	public void setRainQuantity(double rainQuantity) {
		this.rainQuantity = rainQuantity;
	}

	public double getWindPower() {
		return windPower;
	}

	public void setWindPower(double windPower) {
		this.windPower = windPower;
	}

	public String getWindDirection() {
		return windDirection;
	}

	public void setWindDirection(String windDirection) {
		this.windDirection = windDirection;
	}

	public String getTowns() {
		return towns;
	}

	public void setTowns(String towns) {
		this.towns = towns;
	}

	@Override
	public String toString() {
		return "ToString Towns: [temperatureCelsius = " + temperatureCelsius
				+ ", rainQuantity = " + rainQuantity + ", windPower = " + windPower
				+ ", windDirection = " + windDirection + ", towns = " + towns + "]";
	}
}

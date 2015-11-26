package simulateWeatherPrediction;

/**
 * ��������� �� �������������� ����������
 * 
 * �� �� ��������� ��������� �� ���������������� ���������� � 10 ����� �
 * �������� �� 24-����� ������.
 * 
 * ���������� �� �������� ���������� �� ������������� (� ������� �� ������),
 * ���������� �� �������� (� ���������), ���� �� ������ (� ����� � �������) �
 * ������ �� ������ (�����, �����, ����� ��� ��). ������������ �� ��������� �
 * ������-�������� (random) ��������� �� ����������� ��������.
 * 
 * �� ����������� �� ���� 24-����� ������ �� �� ��������� 24 ��������������
 * ���������� - �� ���� �� ����� ����, ���� �� � ���������� �� �� �� ������� �
 * ������ �����.
 * 
 * ���������� ��������� �� �� ���������� � ��������� ��������, ���� �� ���������
 * �������� ��������������:
 * 
 * - ��������� �� ������ ���������� �� ������ ������� - ��������� ��
 * ������������ �� �������� ��� �� ���� - ��������� �� ���� �
 * ����������/��������� �������� �� �����������
 * 
 * �� �� ����������� ���������������� �� ���������� ����:
 * 
 * 1. �������� �� �����������, ����� �������� ������� 2. ���������� �� ������
 * ������� � ����������� �������� �������� 3. ���������� �� ������������ ��
 * ������������� �������� ��� �� ����, �������� ����� 4. ��������� �� ����� ��
 * �����, � ����������/��������� �����������
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
	 * � ����� � �������
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

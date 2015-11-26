package simulateWeatherPrediction;

import java.util.ArrayList;
import java.util.Random;

public class TestTowns {

	static Random random = new Random();
	// static String[][] storeDataAboutTowns = new String[24][5];
	static ArrayList<String> list = new ArrayList<String>();

	static ArrayList<String> minMaxList = new ArrayList<String>();

	private static String[] towns = { "Sofia", "Plovdiv", "Varna", "Burgas",
			"Ruse", "Stara Zagora", "Pleven", "Sliven", "Dobrich",
			"Blagoevgrad" };

	static String windDirection[] = { "East", "West", "South", "North" };

	static double min = 100;
	static double max = 0;
	static int temperatureCelsius;
	static int rainQuantity;
	static int windPower;
	static String windrandom;

	public static void main(String[] args) {
		// GenerateValuesForTowns("Sofia");
		// printValuesForAllTowns();
		// printValuesForSpecificTown(towns[9]);
		printMinMaxValuesForSpecificTown(towns[0]);

	}

	/**GenerateValuesForTowns method is responsible for initializing the values.
	 * 
	 * @param town
	 */
	public static void GenerateValuesForTowns(String town) {
		for (int i = 1; i <= 24; i++) {
			temperatureCelsius = random.nextInt(100);
			rainQuantity = random.nextInt(100);
			windPower = random.nextInt(100);
			windrandom = (windDirection[new Random()
					.nextInt(windDirection.length)]);
			Towns townsVar = new Towns(temperatureCelsius, rainQuantity,
					windPower, windrandom, town);
			list.add("temperatureCelsius " + temperatureCelsius
					+ " rainQuantity " + rainQuantity + " windPower "
					+ windPower + " windDirection " + windrandom + " town "
					+ town + " hour of the day: " + i);
			// System.out.println(list + " hour of the day: " + i);
			getMinMax();

			System.out.println(townsVar.toString() + " hour of the day: " + i);

		}
		minMaxList.add(getMinMax() + " " + town);
	}

	/**
	 * printValuesForAllTowns method is responsible for printing all values for
	 * all the towns. uses the GenerateValuesForTowns
	 * 
	 */
	public static void printValuesForAllTowns() {
		for (int i = 0; i < towns.length; i++) {

			GenerateValuesForTowns(towns[i]);
			System.out.println();
		}
	}

	/**
	 * printValuesForSpecificTown method is responsible for printing all the
	 * values for specified town takes town as argument
	 * 
	 * @param town
	 */
	public static void printValuesForSpecificTown(String town) {
		GenerateValuesForTowns(town);
		for (String str : list) {
			//print the values to confirm they are same
			 System.out.println("ArrayList: " + str);

		}
	}

	/**
	 * printMinMaxValuesForSpecificTown method is responsible for printing min
	 * and max values for specified town takes town as argument
	 * 
	 * @param town
	 */
	public static void printMinMaxValuesForSpecificTown(String town) {
		GenerateValuesForTowns(town);
		System.out.println();
		for (String str : minMaxList) {

			System.out.println("Min and max: " + str);

		}
	}

	public static String getMinMax() {
		if (temperatureCelsius < min) {
			min = temperatureCelsius;
		} else if (temperatureCelsius > max) {
			max = temperatureCelsius;
		} else if (min > max) {
			max = min;
		}

		return "Minimum temperature is : " + min
				+ " & Maximum temperature is: " + max + " for ";
	}

}

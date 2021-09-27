import java.util.Scanner;
public class WindChill {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the temperature in Fahrenheit " + "between -58F and 41F: ");
		double temperature = input.nextDouble();
		System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
		double speed = input.nextDouble();
		// Compute 
		double windChill = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(speed, 0.16) + 0.4275 * temperature * Math.pow(speed, 0.16);

		// Display result
		System.out.println("The wind chill index is " + windChill);
	}
}

public class Desafio01 {
	public static void main (String[] args) {
		double grausCelsius = 2.34;
		double grausFahrenheit = (grausCelsius * 1.8) + 32;
		double grausKelvin = grausCelsius + 273.15;
		double grausReaumur = grausCelsius * 0.8;
		double grausRankine = grausFahrenheit + 459.67;
		
		System.out.printf("Fahrenheit: %.2f\n", grausFahrenheit);
		System.out.printf("Kelvin: %.2f\n", grausKelvin);
		System.out.printf("Reaumur: %.2f\n", grausReaumur);
		System.out.printf("Rankine: %.2f\n", grausRankine);
		
	}
}
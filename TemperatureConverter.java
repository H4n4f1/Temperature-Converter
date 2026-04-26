import java.util.Scanner;
 
public class TemperatureConverter {
 
    // Celsius to other units
    public static double celsiusToFahrenheit(double c) {
        return (c * 9.0 / 5.0) + 32;
    }
 
    public static double celsiusToKelvin(double c) {
        return c + 273.15;
    }
 
    // Fahrenheit to other units
    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5.0 / 9.0;
    }
 
    public static double fahrenheitToKelvin(double f) {
        return fahrenheitToCelsius(f) + 273.15;
    }
 
    // Kelvin to other units
    public static double kelvinToCelsius(double k) {
        return k - 273.15;
    }
 
    public static double kelvinToFahrenheit(double k) {
        return celsiusToFahrenheit(kelvinToCelsius(k));
    }
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("╔══════════════════════════════╗");
        System.out.println("║    Temperature Converter     ║");
        System.out.println("╚══════════════════════════════╝");
 
        System.out.println("\nSelect source unit:");
        System.out.println("  1. Celsius (°C)");
        System.out.println("  2. Fahrenheit (°f)");
        System.out.println("  3. Kelvin (k)");
        System.out.print("\nEnter choice (1-3): ");
 
        int choice = scanner.nextInt();
 
        System.out.print("Enter temperature value: ");
        double value = scanner.nextDouble();
 
        System.out.println("\n──────────────────────────────");
 
        switch (choice) {
            case 1 -> {
                System.out.printf("%.2f °C  =  %.2f °F%n", value, celsiusToFahrenheit(value));
                System.out.printf("%.2f °C  =  %.2f K%n",  value, celsiusToKelvin(value));
            }
            case 2 -> {
                System.out.printf("%.2f °F  =  %.2f °C%n", value, fahrenheitToCelsius(value));
                System.out.printf("%.2f °F  =  %.2f K%n",  value, fahrenheitToKelvin(value));
            }
            case 3 -> {
                System.out.printf("%.2f K  =  %.2f °C%n", value, kelvinToCelsius(value));
                System.out.printf("%.2f K  =  %.2f °F%n", value, kelvinToFahrenheit(value));
            }
            default -> System.out.println("Invalid choice. Please enter 1, 2, or 3.");
        }
 
        System.out.println("──────────────────────────────");
        scanner.close();
    }
}

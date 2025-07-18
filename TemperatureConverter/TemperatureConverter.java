package SaiKetSystems_Internship.TemperatureConverter;
import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("===== Temperature Converter =====");
        System.out.println("Choose conversion type:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = input.nextInt();
        double inputTemp;
        double convertedTemp;
        switch (choice) {
            case 1:

            {
                System.out.print("Enter temperature in Celsius: ");
                inputTemp = input.nextDouble();
                convertedTemp = celsiusToFahrenheit(inputTemp);
                System.out.printf("Fahrenheit temperature of "+inputTemp+"C is"+convertedTemp+"F");
                break;
            }
            case 2:
            {
                System.out.print("Enter temperature in Fahrenheit: ");
                inputTemp = input.nextDouble();
                convertedTemp = fahrenheitToCelsius(inputTemp);
                System.out.printf("Celsius temperature of "+inputTemp+"F is"+convertedTemp+"C");
                break;
            }
            default:
            {
                System.out.println("Invalid choice. Please enter 1 or 2.");
            }
        }
        input.close();
    }
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius*9/5)+32;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit-32)*5/9;
    }
}

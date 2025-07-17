package SaiKetSystems_Internship.Calculator;
import java.util.Scanner;
public class TemperatureConverter {
    public static  void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("===Temperature Converter===");
        System.out.println("1.Celsius to Fahrenheit");
        System.out.println("2.Fahrenheit to Celsius");
        System.out.println("Enter your choice(1 or 2):");
        int choice=input.nextInt();
        switch (choice)
        {
            case 1:
            {
                System.out.println("Enter Celsius value");
                double inputValue=input.nextInt();
                double convertedValue=celsiusToFahrenheit(inputValue);
                System.out.println("Fahrenheit Value of "+inputValue+"C is:"+convertedValue+"F");
                break;
            }
            case 2:
            {
                System.out.println("Enter Fahrenheit value");
                double inputValue=input.nextInt();
                double convertedValue=fahrenheitToCelsius(inputValue);
                System.out.println("Celsius value of "+inputValue+"f is:"+convertedValue+"C");
            }
        }
        input.close();
    }
    public static double celsiusToFahrenheit(double inputValue)
    {
        return (inputValue*9/5)+32 ;
    }
    public static double fahrenheitToCelsius(double inputValue)
    {
        return (inputValue-32)*5/9;
    }
}

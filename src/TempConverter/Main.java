//Identify: Carmelina Jaramillo, 2/15/2024
package TempConverter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Open the prompt
        System.out.print("Please, Type the Temperature in Fahrenheit: ");

        //Take the value
        double Fahrenheit = scanner.nextDouble();
        //Convert the value
        double Celsius = convertTheTemp(Fahrenheit);
        //Method call
        printTemp(Fahrenheit, Celsius);
        //Close the prompt
        scanner.close();

    }

    // Custom method to convert Fahrenheit to Celsius
    public static double convertTheTemp(double Fahrenheit) {
        //Do the math
        return (Fahrenheit - 32) * 5 / 9;
    }

    //Print the temp from Fahrenheit to Celsius
    public static void printTemp(double Fahrenheit, double celsius) {
        //%.2f as the format specifier, printf, two decimal places
        System.out.printf("%.2f F = %.2f C%n", Fahrenheit, celsius);
    }
}

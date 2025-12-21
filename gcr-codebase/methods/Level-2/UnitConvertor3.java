import java.util.*;

public class UnitConvertor3 {

    // Convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double farhenheit) {
        double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
        return farhenheit2celsius;
    }

    // Convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        double celsius2farhenheit = (celsius * 9 / 5) + 32;
        return celsius2farhenheit;
    }

    // Convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    // Convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    // Convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    // Convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Fahrenheit to Celsius
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        System.out.println(fahrenheit + " Fahrenheit = "
                + convertFahrenheitToCelsius(fahrenheit) + " Celsius");

        // Celsius to Fahrenheit
        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();
        System.out.println(celsius + " Celsius = "
                + convertCelsiusToFahrenheit(celsius) + " Fahrenheit");

        // Pounds to Kilograms
        System.out.print("Enter weight in pounds: ");
        double pounds = input.nextDouble();
        System.out.println(pounds + " pounds = "
                + convertPoundsToKilograms(pounds) + " kilograms");

        // Kilograms to Pounds
        System.out.print("Enter weight in kilograms: ");
        double kilograms = input.nextDouble();
        System.out.println(kilograms + " kilograms = "
                + convertKilogramsToPounds(kilograms) + " pounds");

        // Gallons to Liters
        System.out.print("Enter volume in gallons: ");
        double gallons = input.nextDouble();
        System.out.println(gallons + " gallons = "
                + convertGallonsToLiters(gallons) + " liters");

        // Liters to Gallons
        System.out.print("Enter volume in liters: ");
        double liters = input.nextDouble();
        System.out.println(liters + " liters = "
                + convertLitersToGallons(liters) + " gallons");

        input.close();
    }
}

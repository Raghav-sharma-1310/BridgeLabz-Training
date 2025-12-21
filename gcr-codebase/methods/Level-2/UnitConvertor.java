import java.util.*;

public class UnitConvertor {
    // Convert km to miles
    public static double convertKmToMiles(double km) {
        double km2Miles = 0.621371;
        double miles = km * km2Miles;

        // return the value
        return miles;
    }

    // Convert miles to km
    public static double convertMilesToKm(double miles){
        double miles2Km = 1.60934;
        return miles * miles2Km;
    }

    // Convert meters to feet
    public static double convertMetersToFeet(double meters){
        double meters2Feet = 3.28084;
        return meters * meters2Feet;
    }

    // Convert feet to meters
    public static double convertFeetToMeters(double feet){
        double feet2Meters = 0.3048;
        return feet * feet2Meters;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the kilometers : ");
        double km = input.nextDouble();

        // Displaying km to miles
        System.out.println(km + "km = " + convertKmToMiles(km) + "miles");
 
        System.out.print("Enter the miles : ");
        double miles = input.nextDouble();

        // Displaying miles to km
        System.out.println(miles + "miles = " + convertMilesToKm(miles) + "km");

        System.out.print("Enter the meters : ");
        double meters = input.nextDouble();

        // Displaying meters to feet
        System.out.println(meters + "meters = " + convertMetersToFeet(meters) + "feet");

        System.out.print("Enter the feet : ");
        double feet = input.nextDouble();

        // Displaying feet to meters
        System.out.println(feet + "feet = " + convertFeetToMeters(feet) + "meters");

        input.close();
        
    }
}

import java.util.*;

public class UnitConvertor2 {
    // Convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yards2Feet = 3;
        return yards * yards2Feet;
    }

    // Convert feet to yards
    public static double convertFeetToYards(double feet){
        double feet2Yards = 0.333333;
        return feet * feet2Yards;
    }

    // Convert meters to inches
    public static double convertMetersToInches(double meters){
        double meters2Inches = 39.3701;
        return meters * meters2Inches;
    }

    // Convert inches to meters
    public static double convertInchesToMeters(double inches){
        double inches2Meters = 0.0254;
        return inches * inches2Meters;
    }

    // Convert inches to centimeters
    public static double convertInchesToCm(double inches){
        double inches2Cm = 2.54;
        return inches * inches2Cm;
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the yards : ");
        double yards = input.nextDouble();

        // Displaying yards to feet
        System.out.println(yards + " yards = " + convertYardsToFeet(yards) + " feet");
 
        System.out.print("Enter the feet : ");
        double feet = input.nextDouble();

        // Displaying yards to feet
        System.out.println(feet + " feet = " + convertFeetToYards(feet) + " yards");

        System.out.print("Enter the meters : ");
        double meters = input.nextDouble();

        // Displaying meters to inches
        System.out.println(meters + " meters = " + convertMetersToInches(meters) + " inches");

        System.out.print("Enter the inches : ");
        double inches = input.nextDouble();

        // Displaying inches to meters
        System.out.println(inches + " inches = " + convertInchesToMeters(inches) + " meters");

        // Displaying inches to centimeters
        System.out.println(inches + " inches = " + convertInchesToCm(inches) + " centimeters");

        input.close();
        
    }
}

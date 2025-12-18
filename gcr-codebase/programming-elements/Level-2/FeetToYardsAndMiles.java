import java.util.*;
//Creating Class with name FeetToYardsAndMiles indicating the purpose is to convert distance from feet to yards and miles.
class FeetToYardsAndMiles{
    public static void main(String args[]){
       // Creating Scanner object to take distance in feet as input
       Scanner input = new Scanner(System.in);
       double distanceInFeet = input.nextDouble();

       // Converting feet to yards and yards to miles
       double distanceInYards = distanceInFeet / 3;
       double distanceInMiles = distanceInYards / 1760;

       // Displaying converted distance
       System.out.println("The distance in yards is " + distanceInYards + " while the distance in miles is " + distanceInMiles);
 
    }
}
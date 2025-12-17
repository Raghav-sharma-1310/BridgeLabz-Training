import java.util.*;
//Creating Class with name KmToMilesInput indicating the purpose is to convert kilometers to miles using user input.
class KmToMilesInput {
    public static void main(String[] args) {
        // Creating Scanner object to taking kilometers as input from user
        Scanner input = new Scanner(System.in);
        double km = input.nextDouble();

        // Converting kilometers to miles
        double miles = km / 1.6;

        // Displaying the converted distance
        System.out.println("The total miles is "+ miles + " mile for the given " + km + " km");
        input.close();
    }
}
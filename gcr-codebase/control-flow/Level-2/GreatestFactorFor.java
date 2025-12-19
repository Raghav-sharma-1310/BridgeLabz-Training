import java.util.*;
// Creating a class with name GreatestFactorFor to find the greatest factor of a number. 
public class GreatestFactorFor {
    public static void main(String[] args) {
        // Creating scanner object to take number variable as user input
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int greatestFactor = 1;
        
        // Loop to find factors
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }
 
        // Display the result
        System.out.println("Greatest factor is : " + greatestFactor);
     }
}
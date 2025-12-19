import java.util.*;
// Creating a class with name GreatestFactorWhile to find the greatest factor of a number using while loop 
public class GreatestFactorWhile {
    public static void main(String[] args) {
        // Creating scanner object to take number variable as user input
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int greatestFactor = 1;
        
        // Loop to find factors
        int counter = number - 1;
        while ( counter >= 1 ) {
            if (number % counter == 0) {
                greatestFactor = counter;
                break;
            }
            counter--;
        }
 
        // Display the result
        System.out.println("Greatest factor is : " + greatestFactor);
     }
}
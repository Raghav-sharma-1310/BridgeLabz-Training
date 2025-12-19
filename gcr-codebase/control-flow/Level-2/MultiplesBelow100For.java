import java.util.*;
// Creating a class with name MultiplesBelow100For to find all the multiples of a number taken as user input below 100
public class MultiplesBelow100For {
    public static void main(String[] args) {
        // Creating scanner object to take number variable as user input
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        // Checking number is below 100
        if (number > 0 && number < 100) {
 
            // Loop for find all multiples below 100
            for (int i = 100; i >= 1; i--) {
                if (i % number == 0)
                    System.out.println(i);
            }

        } 
        else {
            System.out.println("Invalid output");
        }
     }
}

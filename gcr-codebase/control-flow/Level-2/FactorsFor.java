import java.util.*;
// Creating a class with name FactorsFor to find the factors of a number. 
public class FactorsFor {
    public static void main(String[] args) {
        // Creating scanner object to take number variable as user input
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        // Check positive integer
        if (number > 0) {

            // Loop to find factors
            for (int i = 1; i < number; i++) {
                if (number % i == 0)
                    System.out.println(i);
            }

        } 
        else {
            System.out.println("It is not a positive integer");
        }
    }
}
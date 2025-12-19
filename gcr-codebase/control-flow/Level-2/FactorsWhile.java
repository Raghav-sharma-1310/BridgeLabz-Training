import java.util.*;
// Creating a class with name FactorsWhile to find the factors of a number. 
public class FactorsWhile {
    public static void main(String[] args) {
        // Creating scanner object to take number variable as user input
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        // Check positive integer
        if (number > 0) {

            // Loop to find factors
             int counter = 1;
             while (counter < number) {
                 if (number % counter == 0)
                      System.out.println(counter);

                 counter++;
             }
        } 
        else {
            System.out.println("It is not a positive integer");
        }
    }
}
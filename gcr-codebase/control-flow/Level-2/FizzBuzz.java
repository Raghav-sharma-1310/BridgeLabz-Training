import java.util.*;
// Creating a class with name FizzBuzz to find the multiple of 3 or 5 or both. 
public class FizzBuzz {
    public static void main(String[] args) {
        // Creating scanner object to take number variable as user input
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        
        // Check positive integer
        if (number > 0) {
           
            // Check for mutliples of 3, 5 or both
            for (int i = 1; i <= number; i++) {

                if (i % 3 == 0 && i % 5 == 0)
                    System.out.println("FizzBuzz");
                else if (i % 3 == 0)
                    System.out.println("Fizz");
                else if (i % 5 == 0)
                    System.out.println("Buzz");
            }

        } 
        else {
            System.out.println("It is not a positive integer");
        }
     
     }
}
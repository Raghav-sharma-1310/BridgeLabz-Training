import java.util.*;
// Creating a class with name FizzBuzzWhile to find the multiple of 3 or 5 or both. 
public class FizzBuzzWhile {
    public static void main(String[] args) {
        // Creating scanner object to take number variable as user input
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        
        // Check positive integer
        if (number > 0) {
            
            int i = 1;
            // Check for mutliples of 3, 5 or both
            while(i <= number) {

                if (i % 3 == 0 && i % 5 == 0)
                    System.out.println("FizzBuzz");
                else if (i % 3 == 0)
                    System.out.println("Fizz");
                else if (i % 5 == 0)
                    System.out.println("Buzz");

                i++;
            }

        } 
        else {
            System.out.println("It is not a positive integer");
        }
     
     }
}
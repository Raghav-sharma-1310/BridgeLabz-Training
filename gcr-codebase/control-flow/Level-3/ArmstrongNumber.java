import java.util.*;
// Creating a class with name ArmstrongNumber to check if the given number Armstrong number or not.
public class ArmstrongNumber{
    public static void main(String[] args) {
        // Creating scanner object to take number as user input
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
          
        // Initialze all variables.
        int sum = 0, remainder = 0, counter = 0;
        int originalNumber = number;

        // Count number of digits
        while(originalNumber != 0){
           counter++;
           originalNumber /= 10;
        }
        originalNumber = number;
      
        // Calculating sum of cube of digits
        while(originalNumber != 0){
            remainder = originalNumber % 10;
            sum += Math.pow(remainder, counter);
            originalNumber /= 10;
        }

        // Checking Armstrong or not
        if(number == sum){
            System.out.println("It is an Armstrong number");
        }
        else{
            System.out.println("It is not an Armstrong number");
        }
    }
}

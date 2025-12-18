import java.util.*;
// Creating a class with name SumUntilZeroByBreak to find the sum of numbers until the user enters 0 by using infinite loop and break condition.
public class SumUntilZeroByBreak{
   public static void main(String args[]){
      // Creating scanner object to take number variable as user input
      Scanner input = new Scanner(System.in);
      double total=0.0;
      double number = input.nextDouble();

      // Loop until user enters 0
      while(true){
         total += number;
         number = input.nextDouble();
         // Break condition
         if(number <= 0){
            break;
         }
      }

      // Print the result
      System.out.println("The sum of values : " + total);
   }
}
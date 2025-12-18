import java.util.*;
// Creating a class with name SumUntilZero to find the sum of numbers until the user enters 0
public class SumUntilZero{
   public static void main(String args[]){
      // Creating scanner object to take number variable as user input
      Scanner input = new Scanner(System.in);
      double total=0.0;
      double number = input.nextDouble();

      // Loop until user enters 0
      while(number != 0){
         total += number;
         number = input.nextDouble();
      }
      System.out.println("The sum of values : " + total);
   }
}
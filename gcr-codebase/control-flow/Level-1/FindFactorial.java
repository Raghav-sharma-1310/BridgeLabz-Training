import java.util.*;
// Creating a class with name FindFactorial to find the factorial by using while loop
public class FindFactorial{
   public static void main(String args[]){
      // Creating scanner object to take number variable as user input
      Scanner input = new Scanner(System.in);
      int number = input.nextInt();
      
      // Check for positive integer
      if(number > 0){
         int factorial = 1;
         int i = 1;

         // Calculate factorial using while loop
         while(i<=number){
             factorial *= i;
             i++;
         }

         // Print the result
         System.out.println("The factorial of " + number + " : " + factorial);
      }
      else{
         System.out.println("The number is not Positive number");
      }
   }   
}
import java.util.*;
// Creating a class with name FindFactorialByFor to find the factorial by using for loop
public class FindFactorialByFor{
   public static void main(String args[]){
      // Creating scanner object to take number variable as user input
      Scanner input = new Scanner(System.in);
      int number = input.nextInt();
      
      // Check for positive integer
      if(number > 0){
         int factorial = 1;

         // Calculate factorial using for loop
         for(int i = 1; i<= number; i++){
             factorial *= i;
         }

         // Print the result
         System.out.println("The factorial of " + number + " : " + factorial);  
      }
      else{
         System.out.println("The number is not Positive number");
      }
   }   
}
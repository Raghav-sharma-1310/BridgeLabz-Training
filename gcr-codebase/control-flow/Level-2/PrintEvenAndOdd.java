import java.util.*;
// Creating a class with name PrintEvenAndOdd to print odd and even numbers between 1 to the number entered by the user
public class PrintEvenAndOdd{
   public static void main(String args[]){
      // Creating scanner object to take user input for variable number.
      Scanner input = new Scanner(System.in);
      int number = input.nextInt();
      
      // Check for natural number
      if(number > 0){
         for(int i=1; i<=number; i++){

            // Check odd or even
            if( i % 2 == 0 ){
               System.out.println( i + " is even number");
            }
            else{
               System.out.println( i + " is odd number");
            }
         }
      }
      else{
         System.out.println( number + " is not natural number");
      }
   }
}
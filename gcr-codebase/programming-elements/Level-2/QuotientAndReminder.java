import java.util.*;
//Creating Class with name QuotientAndReminder indicating the purpose is to calculate Quotient and Remainder of two numbers
class QuotientAndReminder{
   public static void main(String args[]){
       // Creating scanner object to take two numbers as input
       Scanner input = new Scanner(System.in);
       int number1 = input.nextInt();
       int number2 = input.nextInt();

       // Calculating quotient and reaminder of two numbers
       int quotient = number1 / number2;
       int remainder = number1 % number2;

       // Displaying the results
       System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder + " of two number " + number1 + " and " + number2);

   }
}  
import java.util.Scanner;
// Creating a class with name LargestNumber for checking largest number 
class LargestNumber{
   public static void main(String args[]){
       // Creating scanner object to take number1, number2, and number3 as user input.
       Scanner input = new Scanner(System.in);
       int number1 = input.nextInt();
       int number2 = input.nextInt();
       int number3 = input.nextInt();
       
       // Flags to store result
       boolean isFirstLargest = false, isSecondLargest = false, isThirdLargest = false;

       // Compare numbers using if-else
       if((number1 > number2) && (number1 > number3)){
             isFirstLargest = true;
       }
       else if((number2 > number1) && (number2 > number3)){
             isSecondLargest = true;
       }
       else if((number3 > number1) && (number3 > number2)){
             isThirdLargest = true;
       }

       // Display the results.
       System.out.println("Is the first number the largest? " + isFirstLargest);
       System.out.println("Is the second number the largest? " + isSecondLargest);
       System.out.println("Is the third number the largest? " + isThirdLargest);
   }
}
       


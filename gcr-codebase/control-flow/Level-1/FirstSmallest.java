import java.util.Scanner;
// Creating a class with name FirstSmallest to indicating the purpose is to check if the first number is the smallest of the 3 numbers 
class FirstSmallest{
   public static void main(String args[]){
       // Creating scanner object to take number1, number2, and number3 as user input.
       Scanner input = new Scanner(System.in);
       int number1 = input.nextInt();
       int number2 = input.nextInt();
       int number3 = input.nextInt();

       // Check if first number is smaller than both others
       boolean isSmallest = (number1 < number2) && (number1 < number3);

       // Display the result
       System.out.println("Is the first number the smallest? " + isSmallest);    
   }
}
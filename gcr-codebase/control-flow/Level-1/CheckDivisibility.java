import java.util.Scanner;
//Creating a class with name CheckDivisibility to indicating the purpose is to check if a number is divisible by 5 or not.
class CheckDivisibility{
    public static void main(String args[]){
       // Creating scanner object to take number as user input
       Scanner input = new Scanner(System.in);
       int number = input.nextInt();

       // Check divisibility by 5 using modulus operator
       boolean isDivisible = (number % 5 == 0);

       // Display the result
       System.out.println("Is the number " + number + " divisible by 5? " + isDivisible);
    }
}
import java.util.*;
// Creating a class with name CheckNaturalNumber to check for the natural number and find sum of n(number) natural numbers
class CheckNaturalNumber{
    public static void main(String args[]){
       // Creating scanner object to take number variable as user input
       Scanner input = new Scanner(System.in);
       int number = input.nextInt();

       // Check for natural number and calculating sum of n(number) natural numbers
       if(number >= 0){
           int sum = number * (number + 1) / 2;
           System.out.println("The sum of "+ number +" natural numbers is "+sum);
       }
       else{
           System.out.println("The number "+ number +" is not a natural number");
       }
    }
}
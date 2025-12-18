import java.util.*;
// Creating a class with name CheckSumEquality to check Sum equality by using for loop
public class CheckSumEqualityByFor{
   public static void main(String args[]){
       // Creating scanner object to take user input of number variable
       Scanner input = new Scanner(System.in);
       int number = input.nextInt();
       int sum = 0;

       // Checking whether number is natural number or not and compare sums
       if(number > 0){
          int sumByFormula = number * (number + 1) / 2;
          for(int i=1; i<=number; i++){
             sum += i;
          }
          System.out.println("Sum using while loop : " + sum);
          System.out.println("Sum using formula : " + sumByFormula);
          System.out.println("Both results are equal : " + (sum == sumByFormula));
       }
       else{
         System.out.println("Number is not natural number");
       }
   }
}
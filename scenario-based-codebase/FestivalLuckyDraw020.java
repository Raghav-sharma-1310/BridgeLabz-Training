/*  20. Festival Lucky Draw 🎉
At Diwali mela, each visitor draws a number.
● If the number is divisible by 3 and 5, they win a gift.
● Use if, modulus, and loop for multiple visitors.
● continue if input is invalid. */

import java.util.Scanner;

public class FestivalLuckyDraw020{
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("\n============= Welcome to Festival Lucky Draw ================");
     int number;
     while(true){
        System.out.println("Enter the number for Lucky Draw (0 for exit) : ");
        number = sc.nextInt();
        if(number == 0){
           System.out.println("\n======= Thanks for Visiting Festival Lucky Draw ===========");
           break; 
        }
        if(number < 0){
          System.out.println("Invalid Input ......");
        }
        else if(number % 15 == 0 && number >0){
           System.out.println(".... You Won Lucky Draw....");
        }
        else{
           System.out.println(".... Better Luck For Next Time ....");
       }
     }
     sc.close();
  }
}
/* 7. The Number Guessing Game 
A game asks the player to guess a number between 1 and 100.
● Use do-while loop.
● Give hints like "Too high" or "Too low".
● Count attempts and exit after 5 wrong tries. */


import java.util.*;
public class NumberGuessingGame007{  
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      // Take random number
      int randomNumber = (int)(Math.random()*100) + 1;
      int input;
      int turn = 0;
      int maxTurn = 5;
      
      // Checking condtions for "too high" and "too low"
      do{
         System.out.println("Enter the number in between 1 and 100 : ");
         input = sc.nextInt();
         turn++;

         if(input > randomNumber){
            System.out.println("Too High");
            System.out.println("---Try Again---");
         }
         else if(input < randomNumber){
            System.out.println("Too Low");
            System.out.println("---Try Again---");
         }
         else{
            System.out.println("You Guessed right, the number was " + input);
            break;
         }
         
      }
      while(maxTurn > turn);   
      if(input != randomNumber){
         System.out.println("Game Over, You Lost. The number was " + input);
      }   
      sc.close();
   }
}
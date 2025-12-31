/* 17. Online Quiz Application 🧠
Ask 5 questions (MCQs) from a user.
● Use arrays and for-loop.
● Record score.
● Switch for answer checking. Apply clear indentation and structured layout */

import java.util.Scanner;

public class OnlineQuiz017{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
    String[] questions = {"Is the Vatican City the smallest country in the world?","Does the chemical symbol 'Au' stand for Silver?","Was Neil Armstrong the first person to walk on the moon?","Did the French Revolution begin in the year 1789?","Is Venus known as the 'Red Planet' in our solar system?"
};  
   String[] answers = {"yes", "no", "yes", "yes", "no"};
   int totalScore = 0;
   System.out.println("\n======== Welcome to Online Quiz Application =========== ");
   System.out.printf("\n%-10s %-40s", "S.No.", "Questions");
   System.out.println("\n----------------------------------------------------------");
   for(int i=0; i<questions.length; i++){
      System.out.printf("%-10s %-40s\n", (i+1), questions[i]);
   }
   System.out.println("\n----------------------------------------------------------");
   
   String input = "";
   for(int i=0; i<questions.length; i++){
      System.out.println("Enter the answers (yes/ no) for question " +(i+1)+" : ");
      input = sc.next();
      switch(input){
         case "yes" ->{ if(answers[i].equals(input)){  
                         totalScore++;
                         System.out.println("...... You answered right .....");
                       }
                       else{
                         System.out.println("........Wrong Answer.......");
                       }
                     }
         case "no" -> { if(answers[i].equals(input)){  
                         totalScore++;
                         System.out.println("...... You answered right .....");
                       }
                       else{
                         System.out.println("........Wrong Answer.......");
                       }
                     } 
      }
   }
   System.out.println("\nYour total score of quiz : " + totalScore);
   System.out.println("\n================ Thank You ========================");
  }
}
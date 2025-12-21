import java.util.*;

public class StudentVoteChecker{
   // Check for Student vote eligibility
   public boolean canStudentVote(int age){
      boolean isVote = false;
      // Validate negative age
      if (age < 0) {
         isVote = false;
      }

      // Check voting eligibility
      if (age >= 18) {
         isVote = true;
      } 
      else {
         isVote = false;
      }      
      return isVote;
   }

   public static void main(String args[]){
      Scanner input = new Scanner(System.in);
      
      // Create an object canVote
      StudentVoteChecker canVote = new StudentVoteChecker();
      
      int age[] = new int[10];
      for(int i = 0; i<10; i++){
         System.out.print("Enter the age of student : ");
         age[i] = input.nextInt();
        
         boolean results = canVote.canStudentVote(age[i]);

         // Display the results
         if(!results){
            System.out.println("Student cannot vote");
         }
         else{
            System.out.println("Student can vote");  
         }
      }
      
      input.close();
   }
}
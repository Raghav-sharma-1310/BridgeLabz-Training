/* 13. Sandeep’s Fitness Challenge Tracker 🏋️
♂Each day Sandeep completes a number of push-ups.
● Store counts for a week.
● Use for-each to calculate total and average.
● Use continue to skip rest days. */

import java.util.Scanner;

public class FitnessChallenge013{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
      int[] numberOfPushUp = new int[7];
      System.out.println("========= Welcome to Fitness Challenge Tracker =========\n");
      int totalPushUp = 0;
      for(int i = 0; i<7; i++){
         System.out.print("Enter the number of pushups (0 for rest-day) for day " + (i+1) + " : ");
         numberOfPushUp[i] = sc.nextInt();
         totalPushUp += numberOfPushUp[i]; 
      }
      System.out.println("========================================================\n");
      int numberOfDays = 0 ;
      for(int i=0; i<7; i++){
          if(numberOfPushUp[i] > 0){
              System.out.println("The number of push-ups of "+ daysOfWeek[i] + " : " + numberOfPushUp[i]);
              numberOfDays++;
          }
          else{
             System.out.println(daysOfWeek[i] + " is rest day");
          }   
      } 
      System.out.println("========================================================\n");
      double averagePushUp = totalPushUp / numberOfDays ;
      System.out.println("The total number of push ups in a week : " + totalPushUp);
      System.out.println("The Average number of the push ups in a week : " + averagePushUp);
      System.out.println("\n=== Thanks for Visiting Fitness Challenge Trakker ======");
     
   }
}

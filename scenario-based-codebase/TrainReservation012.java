/* 12. Train Reservation Queue 🚆
Simulate a basic ticket booking system.
● Show menu with switch
● Allow multiple bookings using while-loop.
● Stop booking once seats reach zero (break).*/

import java.util.*;
public class TrainReservation012{

   public static String[] coachType = {"AC1", "AC2","AC3", "Sleeper"};
   public static int[] seats = {20,20,20,20};
   public static  boolean book(Scanner sc){
      System.out.print("Enter the number based on your booking coach type (1:AC1, 2:AC2, 3:AC3, 4:Sleeper) : ");
      int number = sc.nextInt();
      switch(number){
         case 1 -> {if(seats[number-1] > 0){
                       seats[number-1]--;
                       System.out.println("Seat Number is " + (20-seats[number-1])+ " in " +coachType[number-1]);
                       System.out.println("Your seat is booked Succesfully");
                    }
                    else{
                      System.out.println("No more booking in this coach type");
                      return true;
                   } 
                 }
         case 2 ->{if(seats[number-1] > 0){
                       seats[number-1]--;
                       System.out.println("Seat Number is " + (20-seats[number-1])+ " in " +coachType[number-1]);
                       System.out.println("Your seat is booked Succesfully");
                    }
                    else{
                      System.out.println("No more booking in this coach type");
                      return true;
                    } 
                 }
         case 3 ->{if(seats[number-1] > 0){
                       seats[number-1]--;
                       System.out.println("Seat Number is " + (20-seats[number-1])+ " in " +coachType[number-1]);
                       System.out.println("Your seat is booked Succesfully");
                    }
                    else{
                      System.out.println("No more booking in this coach type");
                      return true;
                    } 
                 }
         case 4 ->{if(seats[number-1] > 0){
                       seats[number-1]--;
                       System.out.println("Seat Number is " + (20-seats[number-1])+ " in " +coachType[number-1]);
                       System.out.println("Your seat is booked Succesfully");
                    }
                    else{
                      System.out.println("No more booking in this coach type");
                      return true;
                    } 
                 }
      }
      return false;
      
   }
   public static void show(){
      System.out.printf("%-10s %-20s %-10s","S.No.", "Coach Type", "Available seat");
      System.out.println("\n---------------------------------------------------------");
      for(int i=0; i<coachType.length; i++){
          System.out.printf("%-10s %-20s %-10s\n",(i+1), coachType[i], seats[i]);
      }   
      System.out.println("\n---------------------------------------------------------");
   }
   public static void exit(){

   }
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("========= Welcome to Train Reservation Counter =========");
      System.out.println();
 
      String input = "";
      boolean isBook = false;
      while(true){
         System.out.print("Choose the options (Book, Exit and Show) : ");
         input = sc.next();
         switch(input){
             case "Book" -> isBook = book(sc);
             case "Show" -> show();
             case "Exit" -> System.out.println("\n=== Thanks for Visiting Train Reservation Counter ===");
         }
         if(isBook){
                 System.out.println("\n=== Thanks for Visiting Train Reservation Counter ===");
                 break;
         }
         if(input.equalsIgnoreCase("Exit")){
                 System.out.println("\n=== Thanks for Visiting Train Reservation Counter ===");
                 break;
         }
      }
   }
}
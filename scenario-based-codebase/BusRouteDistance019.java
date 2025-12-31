/* 19. Bus Route Distance Tracker 🚌
Each stop adds distance.
● Ask if the passenger wants to get off at a stop.
● Use a while-loop with a total distance tracker.
● Exit on user confirmation. */

import java.util.Scanner;

public class BusRouteDistance019{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("\n============= Welcome to Bus ================");
    int option ;
    int totalDistance = 5;
    while(true){
       System.out.print("\nChoose 1:Exit or 2:Continue : ");
       option = sc.nextInt();
       if(option == 1){
         System.out.println("Total Distance Travelled : " + totalDistance);
         System.out.println("\n=============== Thank You =====================");
         break;
       }
       else{
         totalDistance += 5;
         System.out.println("......... Journey Continues ............");   
       }
   }
   sc.close();
  }
}
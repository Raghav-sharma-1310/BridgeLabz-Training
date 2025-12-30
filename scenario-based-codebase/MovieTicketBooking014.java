/* 14. Movie Ticket Booking App 🎬
Ask users for movie type, seat type (gold/silver), and snacks.
● Use switch and if together.
● Loop through multiple customers.
● Clean structure and helpful variable names. */

import java.util.Scanner;

public class MovieTicketBooking014{
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     String[] movieType = {"Drama", "Comedy", "Action", "Adventure", "Horror", "Thriiler", "Romance"};
     int[] moviePrices = {150, 140, 180, 150, 180, 200, 150};
     System.out.println("\n======== Welcome to CB Movie Hall =========== ");
     System.out.printf("\n%-10s %-20s %-10s", "S.No.", "Movie Type", "Price");
     System.out.println("\n---------------------------------------------");
     for(int i=0; i<movieType.length; i++){
        System.out.printf("%-10s %-20s %-10s\n", (i+1), movieType[i], moviePrices[i]);
     }
     System.out.println("\n---------------------------------------------");
     // Total seats in hall
     int goldSeatsAvailable = 5;
     int silverSeatsAvailable = 8;
     while(true){
         int moviePrice =0;
         int seatPrice = 0;
         int snackPrice = 0;

         // Check if hall is full
         if (goldSeatsAvailable == 0 && silverSeatsAvailable == 0) {
             System.out.println("\n House Full! No seats available.");
             break;
         }

         System.out.print("Enter choice: ");
         int movieChoice = sc.nextInt();

         switch (movieChoice) {
              case 1: moviePrice = 150; break;
              case 2: moviePrice = 140; break;
              case 3: moviePrice = 180; break;
              case 4: moviePrice = 150; break;
              case 5: moviePrice = 180; break;
              case 6: moviePrice = 200; break;
              case 7: moviePrice = 150; break;
              default:
                 System.out.println(" Invalid movie choice!");
                 break;
            }
         // Seat selection
         System.out.print("\nSelect Seat Type (Gold / Silver): ");
         String seatType = sc.next();

            if (seatType.equalsIgnoreCase("Gold")) {

                if (goldSeatsAvailable > 0) {
                    seatPrice = 200;
                    goldSeatsAvailable--;
                } else {
                    System.out.println(" Gold seats not available!");
                    break;
                }

            } 
            else if (seatType.equalsIgnoreCase("Silver")) {

                if (silverSeatsAvailable > 0) {
                    seatPrice = 120;
                    silverSeatsAvailable--;
                } else {
                    System.out.println(" Silver seats not available!");
                    break;
                }

            } 
           else {
                System.out.println(" Invalid seat type!");
                break;
            }

            System.out.println("\nSelect Snacks : ");
            System.out.println("1. Popcorn    (₹100)");
            System.out.println("2. Sandwich   (₹80)");
            System.out.println("3. Fries      (₹90)");
            System.out.println("4. Cold Drink (₹60)");
            System.out.println("5. Nachos     (₹110)");

            System.out.print("Enter choice (0 for none) : ");
            int snackChoice = sc.nextInt();

            switch (snackChoice) {
                case 1: snackPrice = 100; break;
                case 2: snackPrice = 80; break;
                case 3: snackPrice = 90; break;
                case 4: snackPrice = 60; break;
                case 5: snackPrice = 110; break;
                case 0: snackPrice = 0; break;
                default:
                    System.out.println(" Invalid snack choice!");
                    continue;
            }

            int totalBill = moviePrice + seatPrice + snackPrice;

            System.out.println("\n========== BILL DETAILS ==========");
            System.out.println("Movie Price       : " + moviePrice);
            System.out.println("Seat Price        : " + seatPrice);
            System.out.println("Snacks Price      : " + snackPrice);
            System.out.println("---------------------------------");
            System.out.println("Total Amount      : " + totalBill);
            System.out.println("=================================");

            System.out.println("\nSeats Remaining:");
            System.out.println("Gold Seats   : " + goldSeatsAvailable);
            System.out.println("Silver Seats : " + silverSeatsAvailable);

            System.out.print("\nBook ticket for another customer? (yes/no): ");
            String choice = sc.next();

            if (!choice.equalsIgnoreCase("yes")) {
                System.out.println("\n ======= Thank you for visiting CB Movie Hall =======");
                break;
            }
        }

        sc.close();
    }
}
 
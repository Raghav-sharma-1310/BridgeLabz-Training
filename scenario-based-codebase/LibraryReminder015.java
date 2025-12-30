/* 15. Rohan’s Library Reminder App 
Rohan wants a fine calculator:
● Input return date and due date.
● If returned late, calculate fine: ₹5/day.
● Repeat for 5 books using for-loop   */

import java.util.Scanner;

public class LibraryReminder015 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int totalFine = 0;

        System.out.println("\n======= Welcome to Rohan's Library Reminder App ============");

        // Loop for 5 books
        for (int i = 1; i <= 5; i++) {

            System.out.println("\nBook " + i + ":");

            System.out.print("Enter Due Date (day number): ");
            int dueDate = sc.nextInt();

            System.out.print("Enter Return Date (day number): ");
            int returnDate = sc.nextInt();

            if (returnDate > dueDate) {
                int lateDays = returnDate - dueDate;
                int fine = lateDays * 5;
                totalFine += fine;

                System.out.println(" Late by " + lateDays + " days");
                System.out.println("Fine for this book: " + fine);
            } else {
                System.out.println(" Returned on time. No fine.");
            }
        }

        // Final fine display
        System.out.println("\n============================================================");
        System.out.println("Total Fine for all books: " + totalFine);
        System.out.println("============================================================");
     
        System.out.println("\n======= Thanks for Visiting Library Reminder App ===========");

        sc.close();
    }
}

import java.util.*;
// Creating a class with LeapYearSingle to find the leap year.
public class LeapYearSingle{
    public static void main(String args[]){
        // Create Scanner object to take input year from user
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();

        // Check condition for Gregorian calendar
        if(year >= 1582){

           // Check year is leap year or not.
           if(year % 4 == 0  && year % 100 != 0 || year % 400 == 0){
               System.out.print(" It is a leap year ");
           }
           else{
                 System.out.println("It is not a leap year");
           }
        }
        else{
           System.out.println("Invalid input");
        }
    }  
}
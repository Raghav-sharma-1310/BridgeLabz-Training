import java.util.*;
//Creating Class with name CentimetersToFeetAndInches indicating the purpose is to convert height from centimeters to feet and inches.
class CentimetersToFeetAndInches{
    public static void main(String args[]){
       // Creating Scanner object to taking height in centimeters as input
       Scanner sc=new Scanner(System.in);
       double heightCm = sc.nextDouble();

       // Converting centimeters to inches and feet
       double cmToInches = heightCm / 2.54;
       double cmToFeet = cmToInches / 12;

       // Displaying converted height
       System.out.println("Your Height in cm is " + heightCm + " while in feet is " + cmToFeet + " and inches is " + cmToInches);
    }
}
import java.util.*;
// Creating a class with name CountNumberOfDigits to count number of digits.
public class CountNumberOfDigits{
    public static void main(String[] args) {
        // Creating scanner object to take number as user input
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
  
        // Calculate the number of digits.
        int count = 0;
        while(number != 0){
             number /= 10;
             count++;
        }
        
        // Display the count       
        System.out.println("Number of digits : " + count);
    }
}
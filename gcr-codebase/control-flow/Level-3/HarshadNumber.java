import java.util.*;
// Creating a class with name HarshadNumber to find the harshad number 
public class HarshadNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int originalNumber = number;
        int sum = 0;

        // Loop to extract each digit and add to sum
        while (originalNumber > 0) {
            int digit = originalNumber % 10;   
            sum += digit;      
            originalNumber /= 10;        
        }

        // Check Harshad condition
        if (sum != 0 && number % sum == 0) {
            System.out.println(" It is a Harshad Number");
        } 
        else {
            System.out.println(" It is not a Harshad Number");
        }

        input.close();
    }
}
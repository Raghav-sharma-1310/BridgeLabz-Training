import java.util.*;
// Creating a class with name AbundantNumber to find the Abundant Number 
public class AbundantNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        // Variable to store sum of divisors
        int sum = 0;

        // Loop to find all divisors except the number itself
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        // Check Abundant condition
        if (sum > number) {
            System.out.println("It is an Abundant Number");
        } 
        else {
            System.out.println("It is not an Abundant Number");
        }

        input.close();
    }
}
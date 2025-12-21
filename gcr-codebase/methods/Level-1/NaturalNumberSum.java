import java.util.*;

public class NaturalNumberSum {
    // Calculating sum of the natural numbers
    public static int calculateNaturalNumberSum(int number){
        int sum = 0;

        // Loop to find the sum 
        for(int i = 1; i <= number; i++){
           sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
       
        // Call method to print the results
        int naturalNumberSum = calculateNaturalNumberSum(number);
        System.out.println("The sum of the " + number + " natural number is " + naturalNumberSum);
    }
}

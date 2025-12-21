import java.util.*;

public class NumberCheck {

    // Method to check whether number is positive or negative
    public static boolean isPositive(int number) {
        return number >= 0;
    }

    // Method to check whether number is even or odd
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method to compare two numbers
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } 
        else if (number1 == number2) {
            return 0;
        } 
        else {
            return -1;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];

        // Taking input for five numbers
        System.out.println("Enter the five numbers : ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        // Loop through array and check conditions
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];

            if (isPositive(number)) {
                System.out.print(number + " is Positive and ");

                if (isEven(number)) {
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }
            } 
            else {
                System.out.println(number + " is Negative");
            }
        }

        // Compare first and last elements
        int result = compare(numbers[0], numbers[numbers.length - 1]);

        System.out.println("\nComparison of first and last elements:");
        if (result == 1) {
            System.out.println("First element is greater than last element");
        } 
        else if (result == 0) {
            System.out.println("First element is equal to last element");
        } 
        else {
            System.out.println("First element is less than last element");
        }

        input.close();
    }
}

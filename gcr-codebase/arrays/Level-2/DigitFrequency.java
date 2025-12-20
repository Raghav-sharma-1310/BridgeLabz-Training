import java.util.*;
// Create a class name with DigitFrequency to find the frequency of digits.
public class DigitFrequency {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking input number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int temp = number;
        int count = 0;

        // Find count of digits
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        // Store digits in an array
        int[] digits = new int[count];
        temp = number;

        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        // Frequency array for digits 0–9
        int[] frequency = new int[10];

        // Calculate frequency
        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }

        // Display frequency
        System.out.println("\nDigit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " time(s)");
            }
        }

        input.close();
    }
}

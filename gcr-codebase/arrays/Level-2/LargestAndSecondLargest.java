import java.util.*;
// Create a class with name LargestAndSecondLargest to find largest and second largest in an array
public class LargestAndSecondLargest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int maxDigit = 10;

        // Declaration of digits array
        int[] digits = new int[maxDigit];
        int index = 0;

        // Store digits
        while (number != 0 && index <= maxDigit) {
            digits[index++] = number % 10;
            number /= 10;
            if (index == maxDigit){
                break;
            }
        }

        int largest = 0, secondLargest = 0;

        // Find largest and second largest
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } 
            else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
 
        // Displaying largest and second largest
        System.out.println("Largest Digit: " + largest);
        System.out.println("Second Largest Digit: " + secondLargest);

        input.close();
    }
}

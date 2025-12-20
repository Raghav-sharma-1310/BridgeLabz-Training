import java.util.Scanner;
// Create a class with name LargestDigits to find largest and second largest digit
public class LargestDigits {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int maxDigit = 10;

        // Declaration of digits array
        int[] digits = new int[maxDigit];
        int index = 0;

        // Store digits
        while (number != 0) {

            if (index == maxDigit) {
                maxDigit += 10;
                int[] temp = new int[maxDigit];

                // Copy old array to new array
                /*for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }*/
                System.arraycopy(digits, 0, temp, 0, digits.length);

                digits = temp;
            }

            digits[index++] = number % 10;
            number /= 10;
        }

        int largest = 0, secondLargest = 0;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } 
            else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Displaying results
        System.out.println("Largest Digit: " + largest);
        System.out.println("Second Largest Digit: " + secondLargest);

        input.close();
    }
}

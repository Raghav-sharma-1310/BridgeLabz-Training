import java.util.Scanner;
// Create a class with name ReverseNumber to reverse a number
public class ReverseNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int originalNumber = number;
        int count = 0;

        // Count digits
        while (originalNumber != 0) {
            count++;
            originalNumber /= 10;
        }
      
        // Declaration of digits and reverse array
        int[] digits = new int[count];
        int[] reverse = new int[count];
         
        originalNumber = number;

        // Store digits
        for (int i = 0; i < count; i++) {
            digits[count-1-i] = originalNumber % 10;
            originalNumber /= 10;
        }

        // Reverse array
        for (int i = 0; i < count; i++) {
            reverse[i] = digits[count - 1 - i];
        }

        // Print thr reverse number
        System.out.print("Reversed Number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(reverse[i]);
        }

        input.close();
    }
}

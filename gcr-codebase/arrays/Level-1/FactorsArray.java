import java.util.*;
// Creating class name FactorsArray to find the factors of a number  
public class FactorsArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int maxFactor = 10;

        // Declaration of the factors array
        int[] factors = new int[maxFactor];
        int index = 0;

        for (int i = 1; i <= number; i++) {

            // Finding factors 
            if (number % i == 0) {

                if (index == maxFactor) {
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];

                    // Copy of elements of factors array to temp array
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp;
                }

                factors[index++] = i;
            }
        }

        // Print the factors
        System.out.println("Factors : ");
        for (int i = 0; i < index; i++){
            System.out.print(factors[i] + " ");
        }
        
        input.close();
    }
}

import java.util.*;
// Creating a class with name MultiplicationTable to find the multiplication  table of given number 
public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        // Array to store multiplication results
        int[] multiplicationTable = new int[10];

        // Store results
        for (int i = 1; i <= 10; i++) {
            multiplicationTable[i - 1] = number * i;
        }

        // Display table
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationTable[i - 1]);
        }

        input.close();

    }
}

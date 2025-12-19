import java.util.*;
// Creating a class with name MultiplicationTable to find the multiplication table 
public class MultiplicationTable {
    public static void main(String[] args) {
        // Creating scanner object to take number variable as user input
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        // Print table from 6 to 9
        if((number >= 6) && (number <=9)){
          for (int j = 1; j <= 10; j++){
            System.out.println(number + " * " + j + " = " + (number * j));
          }
        }
    }
}
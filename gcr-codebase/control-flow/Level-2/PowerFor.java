import java.util.*;
// Creating a class with name PowerFor to find the power of a number 
public class PowerFor {
    public static void main(String[] args) {
        // Create Scanner object to take number and power as user input
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int power = input.nextInt();

        int result = 1;

        // Check positive integer
        if(number > 0){

           // Loop for power calculation
           for (int i = 1; i <= power; i++) {
                result *= number;
           }
           System.out.println("Result is: " + result);
        }
        else {
            System.out.println("It is not a positive integer");
        }
    }
}
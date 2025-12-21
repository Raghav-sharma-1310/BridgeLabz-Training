import java.util.*;

public class TriangularPark {

    public static int calculateNumberOfRounds(int side1, int side2, int side3){
        
        // Calculating perimeter and number of rounds
        int perimeter = (side1 + side2 + side3);
        int numberOfRounds;
        if(5000 % perimeter != 0){
           numberOfRounds = (int)(5000 / perimeter)+1; //distance = 5km = 5000m
        }
        else{
           numberOfRounds = (int)(5000 / perimeter);
        }
        return numberOfRounds;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first side : ");
        int side1 = input.nextInt();
        System.out.print("Enter the second side : ");
        int side2 = input.nextInt();
        System.out.print("Enter the third side : ");
        int side3 = input.nextInt();

        // Call calculateNumberOfRounds method
        int rounds = calculateNumberOfRounds(side1, side2, side3);

        // Display the result
        System.out.println("The number of rounds : " + rounds);
    }
}

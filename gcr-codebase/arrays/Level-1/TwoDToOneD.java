import java.util.*;
// Creating a class TwoDToOneD to convert 2D to 1D array
public class TwoDToOneD {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();
        int columns = input.nextInt();

        // Declaration of 1D and 2D array.
        int[][] twoDArray = new int[rows][columns];
        int[] oneDArray = new int[rows * columns];
        int index = 0;

        // Convert 2D to 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                twoDArray[i][j] = input.nextInt();
                oneDArray[index++] = twoDArray[i][j];
            }
        }

        // Displaying result
        System.out.print("1D Array : ");
        for (int i = 0; i < oneDArray.length; i++){
            System.out.print(oneDArray[i] + " ");
        }
        
        input.close();
    }
}

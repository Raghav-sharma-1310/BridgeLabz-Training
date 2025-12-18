import java.util.*;
//Creating Class with name SquareSide indicating the purpose is to find side of a square from perimeter
class SquareSide{
     public static void main(String args[]){
        //Creating scanner object to take perimeter of square as input.
        Scanner input = new Scanner(System.in);
        double perimeter = input.nextDouble();

        // Calculating the side of square
        double sqSide = perimeter / 4;

        // Displaying results.
        System.out.println("The length of the side is " + sqSide + " whose perimeter is " + perimeter);
     }
}
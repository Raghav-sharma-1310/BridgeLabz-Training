import java.util.*;

public class SmallestAndLargest {
    public static int[] findSmallestAndLargest(int number1, int number2, int number3){
        int smallestLargest[] = new int[2];

        // Checking smallest
        if((number1 < number2) && (number1 < number3)){
            smallestLargest[0] = number1;
        } 
        else if((number2 < number1) && (number2 < number3)){
            smallestLargest[0] = number2;
        }
        else{
            smallestLargest[0] = number3;
         }

        // Checking largest    
        if((number1 > number2) && (number1 > number3)){
            smallestLargest[1] = number1;
        } 
        else if((number2 > number1) && (number2 > number3)){
            smallestLargest[1] = number2;
        }
        else{
            smallestLargest[1] = number3;
         }
         return smallestLargest;
 
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int number1 = input.nextInt();
        System.out.print("Enter the second number : ");
        int number2 = input.nextInt();
        System.out.print("Enter the third number : ");
        int number3 = input.nextInt();
        
        // Call method to return results
        int [] result = findSmallestAndLargest(number1, number2, number3);
        System.out.println("The smallest number is " + result[0]+ " and the largest number is " + result[1]);
    }
}

import java.util.*;

public class RemainderAndQuotient{
    // Calculate remainder and quotient
    public static int[] findRemainderAndQuotient(int number, int divisor){
        int remainderQuotient[] = new int[2];

        // finding remainder 
        int remainder = number % divisor;
        remainderQuotient[0] = remainder;

        // finding quotient
        int quotient = number / divisor;
        remainderQuotient[1] = quotient;

        return remainderQuotient;
 
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = input.nextInt();
        System.out.print("Enter the divisor : ");
        int divisor = input.nextInt();
        
        // Call method to return results
        int [] result = findRemainderAndQuotient(number, divisor);
        System.out.println("The remainder of number is " + result[0]+ " and the quotient of number is " + result[1]);
    }
}

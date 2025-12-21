import java.util.*;

public class DistributeChocolate{
    // Calculate remainder and quotient
    public static int[] findRemainderAndQuotient(int numberOfChocolates, int numberOfChildren){
        int remainderQuotient[] = new int[2];

        // finding remainder 
        int remainder = numberOfChocolates % numberOfChildren;
        remainderQuotient[0] = remainder;

        // finding quotient
        int quotient = numberOfChocolates / numberOfChildren;
        remainderQuotient[1] = quotient;

        return remainderQuotient;
 
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of chocolates : ");
        int numberOfChocolates = input.nextInt();
        System.out.print("Enter the number of children : ");
        int numberOfChildren = input.nextInt();
        
        // Call method to store results in result array 
        int [] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

        // Print remainder children to get chocolate and number of children chocolate get.
        System.out.println("The remaining children is " + result[0]+ " and the number of chocolates each child get is " + result[1]);
    }
}

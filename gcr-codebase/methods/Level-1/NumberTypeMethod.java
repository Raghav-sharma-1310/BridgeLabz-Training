import java.util.*;

public class NumberTypeMethod {
    // checkNumberType method to find integer type
    public static int checkNumberType(int number){
        if(number > 0){
             return 1;  // positive number
        }
        else if(number == 0){
             return 0; // zero
        }
        else{
            return -1; // negative number   
        }
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = input.nextInt();

        // Call method to return results
        int result = checkNumberType(number);
        System.out.println( result );
    }
}

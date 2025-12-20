import java.util.*;
// Creating a class with name CheckIntegerType to check whether the integer is positive,  negative or zero
public class CheckIntegerType {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number [] = new int[5];

        // Storing the Array values
        for(int i=0 ; i<number.length ; i++){
            number[i] = input.nextInt();
        }

        // Check whether student can vote or not.
        for(int j=0 ; j<number.length ; j++){
            if (number[j] > 0) {
                System.out.print(number[j] + " is Positive and ");
                if (number[j] % 2 == 0){
                    System.out.println("Even Number");
                }
                else{
                    System.out.println("Odd Number");
                }
            } 
            else if (number[j] < 0) {
                System.out.println(number[j] + " is Negative Number");
            } 
            else {
                System.out.println(number[j] + " is Zero");
            }
         }

        // Compare first and last element
        if (number[0] == number[4])
            System.out.println("First and Last elements are Equal");
        else if (number[0] > number[4])
            System.out.println("First element is Greater than Last");
        else
            System.out.println("First element is Less than Last");

        input.close();
       
     }
}
import java.util.*;
// Creating a class with name ArraySumLimit to find the  sum of all numbers untill the zero or negative number
public class ArraySumLimit {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0; 
         
        // Check if the user entered 0 or a negative number to break the loop
        while(true){
           double value = input.nextDouble();
           if( (value <= 0) || (index == 10) ){
                 break;
           }
           numbers[index] = value;
           index++;
        }
        
        // Calculate sum
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }
 
        // Display the total value
        System.out.println("Total = " + total);
        input.close();
     }
}
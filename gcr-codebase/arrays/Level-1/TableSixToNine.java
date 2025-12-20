import java.util.*;
// Create a class name with TableSixToNine to find the multplication table
public class TableSixToNine{
  public static void main(String args[]){
      
     Scanner input = new Scanner(System.in);
     int number =input.nextInt();
     int multiplicationResult[] = new int[10];
     
      // Check number is from 6 to 9 or not
      if((number >= 6) && (number <=9)){
         
          // Store results
          for (int i = 1; i <= 10; i++) {
               multiplicationResult[i - 1] = number * i;
          }

          // Print table
          for (int j = 1; j <= 10; j++){
                System.out.println(number + " * " + j + " = " + multiplicationResult[j - 1]);
          }
      }
      else{
           System.out.println(" Number is not from 6 to 9 ");
      }
       
      input.close(); 
   }
}
 
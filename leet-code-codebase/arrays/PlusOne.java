import java.util.*;
public class PlusOne{
   public static int[] plusOne(int[] digits) {
        int index = digits.length-1;
        for(int i=digits.length-1; i>=0; i--){
            if(digits[index] < 9){
                digits[index]++;
                return digits;
            }
            digits[index] = 0;
            index--;
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
   }
   public static void main(String args[]){
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the number of digits : ");
      int number = input.nextInt();
      int digits[] = new int[number];
      System.out.print("Enter the numbers : ");
      for(int i = 0; i<digits.length; i++){
         digits[i] = input.nextInt();
      }
      int results[] = plusOne(digits);
      for(int i = 0; i<results.length; i++){
         System.out.print(results[i]);
      }

   }
}

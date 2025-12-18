import java.util.*;
//Creating Class with name IntOperation indicating the purpose is to print the integer operations.
class IntOperation{
   public static void main(String args[]){
      // Creating scanner object to take a, b and c variables as input from user 
      Scanner input = new Scanner(System.in);
      int a = input.nextInt();
      int b = input.nextInt();
      int c = input.nextInt();

      // Calculating results of operations
      int operation1 = a + b * c;
      int operation2 = a * b + c;
      int operation3 = c + a / b;
      int operation4 = a % b + c;

      // Displaying the results
      System.out.println("The results of Int Operations are " + operation1 + ", " + operation2 + ", " + operation3 +  ", and " + operation4);

   }  
}
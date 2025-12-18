import java.util.*;
//Creating Class with name DoubleOpt indicating the purpose is to print the Double operations.
class DoubleOpt{
   public static void main(String args[]){
      // Creating scanner object to take a, b and c variables as input from user 
      Scanner input = new Scanner(System.in);
      double a = input.nextDouble();
      double b = input.nextDouble();
      double c = input.nextDouble();

      // Calculating results of operations
      double operation1 = a + b * c;
      double operation2 = a * b + c;
      double operation3 = c + a / b;
      double operation4 = a % b + c;

      // Displaying the results
      System.out.println("The results of Int Operations are " + operation1 + ", " + operation2 + ", " + operation3 +  ", and " + operation4);

   }  
}
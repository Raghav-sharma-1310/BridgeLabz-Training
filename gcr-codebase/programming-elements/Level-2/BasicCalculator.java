import java.util.*;
/*Creating Class with name BasicCalculator indicating the purpose is to Perform Arithmetic Operations of addition, subtraction, multiplication, and division */
class BasicCalculator{
    public static void main(String args[]){
       // Creating Scanner object to take user input of variables number1 and number2.
       Scanner sc = new Scanner(System.in);
       int number1 = sc.nextInt();
       int number2 = sc.nextInt();
       
       //Addition operation.
       int sum = number1 + number2;
       
       //Subtraction operation.
       int difference = number1 - number2;
     
       //Multiplication operation.
       int product = number1 * number2;
 
       //Division operation.
       int division = number1 / number2;
 
       //Displaying Arthematic operation results.
       System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " + number1 + " and " + number2 + " is " + sum + ", " + difference + ", "+ product +"," + " and " + division);

    } 
}
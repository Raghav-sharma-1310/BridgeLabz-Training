import java.util.*;
//creating a class PowerWhile to find the power of a number given by user
class PowerWhile{
     public static void main(String [] args){
	   Scanner input = new Scanner(System.in);
	   int number = input.nextInt();
	   int power = input.nextInt();
	   int result = 1;
 
           // Check Positive number
           if(number > 0) {
              
	        // finding power using for loop
                int temp = 1;
	        while(temp <= power){
	              result *= number;
       	              temp++;
	         }
                //displaying the output
	        System.out.println("the result for the input is: " + result);
            }
            else{
                System.out.println("It is not a positive integer");
            }
     }
}	

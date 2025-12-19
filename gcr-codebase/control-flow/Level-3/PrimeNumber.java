import java.util.*;
// Creating a class with name PrimeNumber to check if the given number prime number or not.
public class PrimeNumber {
    public static void main(String[] args) {
        // Creating scanner object to take number as user input
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        
        // This isPrime flag is used to store results.     
        boolean isPrime = true;
        if(number > 1){
          
           // Checking number is prime or not
           for(int i=2; i<= number-1; i++){
              if( number % i == 0){
                  isPrime = false;
                  break;
               }
            }
            if(isPrime){
               System.out.println(number + " is prime number ");
            }
            else{
               System.out.println(number + " is not prime number");
            }
        }
        else{
            System.out.println("Number is not greater than 1 " );
        }
     }
}

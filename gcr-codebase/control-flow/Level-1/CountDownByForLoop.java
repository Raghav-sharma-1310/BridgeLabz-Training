import java.util.*;
// Creating a class with name CountDownTheNumber to count down the number by using for loop
class CountDownByForLoop{
    public static void main(String args[]){
       // Creating scanner object to take counter variable as user input
       Scanner input = new Scanner(System.in);
       int counter = input.nextInt();

       // Countdown using for loop
       for(int i=counter; i >= 1; i--){
          System.out.print(i + " ");
       }
    } 
}
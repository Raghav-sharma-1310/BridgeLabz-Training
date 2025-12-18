import java.util.*;
// Creating a class with name CountDownTheNumber to count down the number
class CountDownTheNumber{
    public static void main(String args[]){
       // Creating scanner object to take counter variable as user input
       Scanner input = new Scanner(System.in);
       int counter = input.nextInt();

       // Countdown using while loop
       while(counter>=1){
          System.out.print(counter + " ");
          counter--;
       }
    } 
}
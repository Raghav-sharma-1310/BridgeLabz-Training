import java.util.*;
// Creating a class with name NumberCheck for checking whether number is positive, negative or zero. 
class NumberCheck{
    public static void main(String args[]){
       // Creating scanner object to take number variable as user input
       Scanner input = new Scanner(System.in);
       int number = input.nextInt();
       
       // Check number type
       if(number > 0){
           System.out.println("positive");
       }
       else if(number == 0){
           System.out.println("zero");
       }
       else{
           System.out.println("negative");
       }
    }
}
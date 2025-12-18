import java.util.*;
// Creating a class with name CheckAgeToVote to check whether a person can vote 
class CheckAgeToVote{
    public static void main(String args[]){
       // Creating scanner object to take age variable as user input
       Scanner input = new Scanner(System.in);
       int age = input.nextInt();
       
       // Check voting condition
       if(age >= 18){
          System.out.println("The person's age is "+ age +" and can vote");
       }
       else{
          System.out.println("The person's age is "+ age + " and cannot vote");
       }
    }
}
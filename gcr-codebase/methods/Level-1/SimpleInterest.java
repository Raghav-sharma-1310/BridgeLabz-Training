import java.util.*;

public class SimpleInterest {
    //  CalculateSimpleInterest method to calculate simple interest
    public double calculateSimpleInterest( double principal, double rate, double time){
         
        double simpleInterest = (principal * rate * time) / 100;
        return simpleInterest;
    }

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
      
        // Take input of principal, rate, and time
        System.out.print("The principal : ");
        double principal = input.nextDouble();
        System.out.print("The rate : ");
        double rate = input.nextDouble();
        System.out.print("The time : ");
        double time = input.nextDouble();

        // Object for the SimpleInterest class
        SimpleInterest SI = new SimpleInterest();

        // Print the result
        System.out.println("The Simple Interest is " + SI.calculateSimpleInterest(principal, rate, time) + " for Principal " + principal + ", Rate of Interest "+ rate + " and Time " + time);
    }
}

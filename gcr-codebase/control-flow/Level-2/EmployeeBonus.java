import java.util.*;
// Creating a class with name EmployeeBonus to find the bonuses of employees. 
public class EmployeeBonus {
    public static void main(String[] args) {
        // Create a scanner object to take salary and years variables as user input
        Scanner input = new Scanner(System.in);
        double salary = input.nextDouble();
        int years = input.nextInt();

        // Check bonus condition
        if (years > 5) {
            double bonusAmount = salary * 0.05;
            System.out.println("Bonus amount is : " + bonusAmount);
        } 
        else {
            System.out.println("No Bonus");
        }
    }
}
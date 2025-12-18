import java.util.*;
//Creating Class with name CalculateTotalPrice indicating the purpose is to calculate total purchase price
class CalculateTotalPrice{
    public static void main(String args[]) {

        // Creating Scanner object to take unit price and quantity as input
        Scanner input = new Scanner(System.in);
        double unitPrice = input.nextDouble();
        int quantity = input.nextInt();

        // Calculating total price
        double totalPrice = unitPrice * quantity;

        // Displaying total purchase cost
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice );
     }
}											

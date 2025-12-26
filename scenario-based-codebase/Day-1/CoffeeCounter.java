/*Problem 1: The Coffee Counter Chronicles

Ravi runs a café where customers order different types of coffee with specific quantities */

import java.util.*;
public class CoffeeCounter{

     public static double getBill(String category, Scanner input){
        double totalAmount = 0.0;
        int price =0;

        // Checking category of coffee and assigning prices to them
        switch(category){
            case "Espresso":
                price = 150;
                break; 
            case "Ammericano":
                price = 200;
                break;   
            case "Cappuccino":
                price = 150;
                break;
            case "Mocha":
                price = 150;
                break;
            case "CaramelMacchiato":
                price = 550;
                break;
            case "Tea":
                price = 50;
                break;
            case "CafeLatte":
                price = 250;
                break;
            case "Chocolate":
                price = 120;
                break;
            case "LemonTea":
                price = 80;
                break;
            case "OrangeJuice":
                price = 80;
                break;
            default:
                System.out.println("Invalid item. Try again.");
                return 0;
        }

        System.out.print("Enter the quantity : ");
        int quantity = input.nextInt();

        System.out.println("Item \t\t Price \t Quantity \t Gst \t Total Amount");
        System.out.println("----------------------------------------------------------------------");
        
        // Bill calculation
        double total = price * quantity;
        double gstAmount = (price * quantity) * 0.05;
        totalAmount = total + gstAmount;

        // Diaplaying results 
        switch(category){
            case "Espresso":
                System.out.println("Espresso\t"+price+" \t  "+quantity+"\t\t   5%    \t"+totalAmount);
                break; 
            case "Ammericano":
                System.out.println("Ammericano\t"+price+" \t  "+quantity+"\t\t   5%    \t"+totalAmount);
                break;   
            case "Cappuccino":
                System.out.println("Cappuccino\t"+price+" \t  "+quantity+"\t\t   5%    \t"+totalAmount);
                break;
            case "Mocha":
                System.out.println("Mocha \t\t"+price+" \t  "+quantity+"\t\t   5%    \t"+totalAmount);
                break;
            case "CaramelMacchiato":
                System.out.println("CaramelMacchiato "+price+" \t  "+quantity+"\t\t   5%    \t"+totalAmount);
                break;
            case "Tea":
                System.out.println("Tea  \t\t"+price+" \t  "+quantity+"\t\t   5%    \t"+totalAmount);
                break;
            case "CafeLatte":
                System.out.println("CafeLatte\t"+price+" \t  "+quantity+"\t\t   5%    \t"+totalAmount);
                break;
            case "Chocolate":
                System.out.println("Chocolate\t"+price+" \t  "+quantity+"\t\t   5%    \t"+totalAmount);
                break;
            case "LemonTea":
                System.out.println("LemonTea\t"+price+" \t  "+quantity+"\t\t   5%    \t"+totalAmount);
                break;
            case "OrangeJuice":
                System.out.println("OrangeJuice\t"+price+" \t  "+quantity+"\t\t   5%    \t"+totalAmount);
                break;
        }
        System.out.println("----------------------------------------------------------------------");

        return totalAmount;

     }
     
     public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        double totalBill = 0.0;
        System.out.println("------Welcome to Ravi's Café------");
        System.out.println("\nMENU = Espresso, Ammericano, Cappuccino, Mocha, CaramelMacchiato, Tea, CafeLatte,  Chocolate, LemonTea, OrangeJuice");

        // Infinite loop to take multiple inputs
        while(true){
           System.out.print("\nEnter the Item from Menu : ");
           String category = input.next();

           // Break loop when user enter exit
            if (category.equalsIgnoreCase("exit")) {
                break;
           }
           totalBill += getBill(category, input);
        }

        // Displaying total ammount bill
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Total Amount\t \t \t \t \t" + totalBill);
        System.out.println("\n------Thank you for visiting Ravi's Café------");
     }

}
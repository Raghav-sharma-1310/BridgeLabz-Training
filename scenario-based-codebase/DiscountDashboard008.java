/* 8. Shopkeeper’s Discount Dashboard 🛍️
A shopkeeper gives discounts based on total bill:
● Input item prices in a for-loop.
● Use if-else for discount logic.
● Use proper indentation, constants, and comments. */

import java.util.*;
public class DiscountDashboard008{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      
      String[] bookType = {"APJ Abdul Kalam", "Good Habits", "Harry Potter", "Ann Frank", "The CaterpillarGhost"};
      int prices[] = {120, 100, 500, 420, 280};
      int quantities[] = new int[prices.length];
      System.out.println("========== Welcome to ABC Book Shop ==========");
      System.out.println();
      System.out.println("+------+----List of Books-----+------------+");
      System.out.printf("| %-4s | %-20s | %-10s |%n", "S.No.", "ITEM NAME", "PRICE");
      System.out.println("+------+----------------------+------------+");
      for(int i=0; i<prices.length; i++){
         System.out.printf("| %-4d | %-20s | %-10d |%n", i+1, bookType[i], prices[i]);
      }
      System.out.println("+------+----------------------+------------+");
      while(true){

         System.out.print("Enter the book title name : ");
         String title = sc.nextLine();
         if (title.equals("0")){			
        	break;
	 }
         System.out.print("Enter the quantity of this book : ");
         int input = sc.nextInt();
         sc.nextLine();
         switch(title){
             case "APJ Abdul Kalam" -> {
                   quantities[0] += input;
             }
             case "Good Habits" -> {
                   quantities[1] += input;
             }
             case "Harry Potter" -> {
                   quantities[2] += input;
             }     
             case "Ann Frank" -> {
                   quantities[3] += input;
             }     
             case "The CaterpillarGhost" -> {
                   quantities[4] += input;
             }                
         }
      }
      int totalPrices[] = new int[5];
      for(int i=0; i<totalPrices.length; i++){
         totalPrices[i] = quantities[i] * prices[i];
      }
      
      int totalAmount = 0;
      for(int i=0; i<totalPrices.length; i++){
         totalAmount += totalPrices[i];
     }
     System.out.println("\n\n================== Billing ======================\n");
     System.out.printf("%-20s %-10s %-10s %-10s %n", "Item-Name", "Prices", "Quantity", "Item Total");
     System.out.println("----------------------------------------------------");
     for ( int i = 0; i<prices.length; i++){
	if( quantities[i]!=0)
	    
	System.out.printf("\n%-20s %-10d %-10d %-10d%n", bookType[i], prices[i], quantities[i], totalPrices[i]);

     }
     System.out.println("----------------------------------------------------");
     System.out.println("Total Amount : " + totalAmount);

     double discountAmount = 0.0;
     if(totalAmount > 2000){
        discountAmount = totalAmount * 0.80;
     }
     else{
        discountAmount = totalAmount * 0.95;
     }
     System.out.println("----------------------------------------------------");
     System.out.println("Total Amount after Discount : " + discountAmount);
     System.out.println("----------------------------------------------------");
     System.out.println();
     System.out.println("========== Thanks for visiting ABC Book Shop ==========");
  }
}
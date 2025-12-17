import java.util.*;
//Creating Class with name DiscountOnStudentFee indicating the purpose is to calculate discount and discount fee using user input 
class DiscountOnStudentFee{
    public static void main(String args[]){
         // Creating Scanner object to taking fee and discount percentage as input from user
         Scanner sc = new Scanner(System.in);
         int fee = sc.nextInt();
         int discountPercent = sc.nextInt();

         // Calculating discount amount and discounted fee after discount
         double discount = (fee * discountPercent) / 100;
         double discountedFee = fee - discount;

         // Displaying discount details
         System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);
    }
}

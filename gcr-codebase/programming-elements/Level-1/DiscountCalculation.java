//Creating Class with name DiscountCalculation indicating the purpose is to calculate discount and discounted fee
class DiscountCalculation{
    public static void main(String args[]){
         // Declaring variables to store fee and discount percentage
         int fee = 125000;
         int discountPercent = 10;

         // Calculating discount amount and discounted fee after discount
         double discount = (fee * discountPercent) / 100;
         double discountedFee = fee - discount;

         // Displaying discount details
         System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);
    }
}

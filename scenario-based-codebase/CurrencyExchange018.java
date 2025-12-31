/* 18. Currency Exchange Kiosk 💱
Design a currency converter:
● Take INR amount and target currency.
● Use a switch to apply the correct rate.
● Ask if the user wants another conversion (do-while). */

import java.util.Scanner;
public class CurrencyExchange018{
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("\n============== Welcome to Currency Exchange =================\n");
     int currencyInINR;
     String input = "";
     do{
        System.out.print("\nEnter the INR amount which you want to convert : ");
        currencyInINR = sc.nextInt();
        System.out.print("Choose currency conversion type (USD, EUR, AUD, GBP) : ");
        input = sc.next();
        switch(input){
            case "USD" ->System.out.println("The Converted Amount in USD is " + (currencyInINR / 90));
            case "EUR" ->System.out.println("The Converted Amount in EUR is " + (currencyInINR / 105));
            case "AUD" ->System.out.println("The Converted Amount in AUD is " + (currencyInINR / 58));
            case "GBP" ->System.out.println("The Converted Amount in GBP is " + (currencyInINR / 116));
     
        }
     }
     while(true && (! input.equalsIgnoreCase("exits")));
     System.out.println("\n=========== Thanks for Visiting Currency Exchange ==============");
  }
}
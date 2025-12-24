import java.util.*;
public class PalindromeString{
   // Method to reverse the string
   public static String getReverseString(String name){
      String tempString = "";
      for(int i=0; i<name.length(); i++){
         tempString += name.charAt(name.length()-i-1);
      }
      return tempString;
   }
   public static void main(String args[]){
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the name : ");
      String name = input.next();
      
      // Call method to return the reverse string
      String reverseString = getReverseString(name);
      
      System.out.println("The Reverse string of "+ name + " is " +  reverseString);

      if(name.equals(reverseString)){
         System.out.println("Yes, it is palindrome string");
      }
      else{
        System.out.println("No, it is not palindrome string");
      }

      input.close();
   }
}
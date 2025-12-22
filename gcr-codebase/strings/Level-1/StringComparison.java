import java.util.*;
 
public class StringComparison{

   public static boolean checkEquality(String string1, String string2){
     boolean isBothEqual = false;
     if(string1.equals(string2)){
        isBothEqual = true;
     }
     else{
        isBothEqual = false;
     }
     return isBothEqual;
   }
 
   public static void main(String args[]){
      Scanner input = new Scanner(System.in);
      String string1 = input.next();
      String string2 = input.next();
      boolean isEqual = false;
      if(string1.length() == string2.length()){
         for(int i=0; i<string1.length(); i++){
            if(string1.charAt(i) == string2.charAt(i)){
               isEqual = true;
            }
         }
      }
      else{
         isEqual = false;
      }
      System.out.println("Manually checking : "+ isEqual);
      System.out.println("Inbuilt checking : "+ checkEquality(string1, string2) );
      if(isEqual == checkEquality(string1, string2)){
         System.out.println("Both the strings are equal");
      }
      else{
         System.out.println("Both the strings are not equal");
      }
      input.close();       
   }
}
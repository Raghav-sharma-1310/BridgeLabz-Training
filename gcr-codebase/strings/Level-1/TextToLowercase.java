import java.util.*;

public class TextToLowercase{
   // Method to convert text to lowercase by charAt function
   public static String getTextLowercase(String string){
      String tempString ="";
      for(int i = 0; i<string.length(); i++){
          if((int)string.charAt(i) < 97){
              tempString += (char)((int)string.charAt(i) + 32);
          }
      }
      return tempString;
   }
   
   // Method to convert text to lowercase by inbuilt function
   public static String getInbuiltTextLowercase(String text){
      String tempString = text.toLowerCase();
      return tempString;
   }

   // Checking equality of substring 
   public static boolean checkEquality(String str1, String str2){
      boolean isEqual = false;
      if(str1.length() == str2.length()){
         for(int i=0; i<str1.length(); i++){
            if(str1.charAt(i) == str2.charAt(i)){
               isEqual = true;
            }
         }
      }
      else{
         isEqual = false;
      }
      return isEqual;
   }

   
   public static void main(String args[]){
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the String : ");
      String text = input.nextLine();
      
      String str1 = getTextLowercase(text);
      System.out.println("The lower case string using charAt : " + str1 );
      String str2 = getInbuiltTextLowercase(text);
      System.out.println("The lower case string using inbuilt : " + str2);
      
      boolean isBothEqual = checkEquality(str1, str2);
      if(isBothEqual){
        System.out.println("Both are Equal");
      }
      else{
        System.out.println("Both are Equal");
      }

   }  
}
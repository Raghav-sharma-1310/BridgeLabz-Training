import java.util.*;

public class TextToUppercase{
   // Method to convert text to uppercase by charAt function
   public static String getTextUppercase(String string){
      String tempString ="";
      for(int i = 0; i<string.length(); i++){
          if((int)string.charAt(i)>=97){
              tempString += (char)((int)string.charAt(i) - 32);
          }
      }
      return tempString;
   }
   
   // Method to convert text to uppercase by inbuilt function
   public static String getInbuiltTextUppercase(String text){
      String tempString = text.toUpperCase();
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
      System.out.println("Enter the String : ");
      String text = input.nextLine();
      
      String str1 = getTextUppercase(text);
      System.out.println("The upper case string using charAt : " + str1 );
      String str2 = getInbuiltTextUppercase(text);
      System.out.println("The upper case string using inbuilt : " + str2);
      
      boolean isBothEqual = checkEquality(str1, str2);
      if(isBothEqual){
        System.out.println("Both are Equal");
      }
      else{
        System.out.println("Both are Equal");
      }

   }  
}
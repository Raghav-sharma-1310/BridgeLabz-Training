import java.util.*;
public class Substring{
  // Checking substring from charAT function
  public static String getSubstring(String string, int startIndex, int endIndex){
      String emptyString = "";
      for(int i=startIndex; i<endIndex; i++){
          emptyString += string.charAt(i);
      }
      return emptyString;
  }

  // Checking substring from inbuilt functions
  public static String getSubstringFromInbuilt(String string, int startIndex, int endIndex){
      String tempString = string.substring(startIndex, endIndex);
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
      System.out.print("Enter the string : ");
      String string = input.next();
      System.out.print("Enter the Starting index : ");
      int startIndex = input.nextInt();
      System.out.print("Enter the destination index : ");
      int endIndex = input.nextInt();
      
      String str1 = getSubstring(string, startIndex, endIndex);
      System.out.println("The substring by manually : " + str1);

      String str2 = getSubstringFromInbuilt(string, startIndex, endIndex);
      System.out.println("The substring by inbuilt function : " + str2);
      // Checking both substrings.
      boolean isBothEqual = checkEquality(str1, str2);
      if(isBothEqual){
        System.out.println("Both are Equal");
      }
      else{
        System.out.println("Both are Equal");
      }
  }
}
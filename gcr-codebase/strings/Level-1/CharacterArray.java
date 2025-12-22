import java.util.*;
public class CharacterArray{
  // Checking CharacterArray from user method 
  public static char[] getCharacterArray(String string){
      char [] characterArray = new char[string.length()];
      for(int i=0; i<string.length(); i++){
         characterArray[i]=string.charAt(i); 
      }
      return characterArray;
  }

  // Checking CharacterArray from inbuilt functions
  public static char[] getCharacterArrayFromInbuilt(String string){
      char[] charArray = string.toCharArray();
      return charArray;
  }
  
  // Checking equality of Character Array
  public static boolean checkEquality(char[] char1, char[] char2){
      boolean isEqual = false;
      if(char1.length == char2.length){
         for(int i=0; i<char1.length; i++){
            if(char1[i] == char2[i]){
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
      
      char[] char1 = getCharacterArray(string);
      System.out.print("The user method character array : ");
      for(int i=0; i<char1.length; i++){
         System.out.print(char1[i]);
      }

      char[] char2 = getCharacterArrayFromInbuilt(string);
      System.out.print("\nThe inbuilt method character array : ");
      for(int i=0; i<char2.length; i++){
         System.out.print(char2[i]);
      }

      // Checking both substrings.
      boolean isBothEqual = checkEquality(char1, char2);
      if(isBothEqual){
        System.out.println("\nBoth are Equal");
      }
      else{
        System.out.println("\nBoth are Equal");
      }
  }
}
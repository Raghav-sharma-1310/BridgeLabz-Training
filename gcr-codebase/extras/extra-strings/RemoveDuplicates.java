import java.util.*;
public class RemoveDuplicates{
   // Remove Duplicates from string
   public static char[] removeDuplicates(String name){
        int length = name.length();
        char[] tempCharArray = new char[length]; 
        int counter = 0;
        for (int i = 0; i < length; i++) {
            char currentChar = name.charAt(i);
            boolean isAlreadyPresent = false;
            for (int j = 0; j < i; j++) {
                if (name.charAt(j) == currentChar) {
                    isAlreadyPresent = true;
                    break;
                }
            }
            if (!isAlreadyPresent) {
                tempCharArray[counter] = currentChar;
                counter++;
            }
        }
        char[] finalArray = new char[counter];
        for (int i = 0; i < counter; i++) {
            finalArray[i] = tempCharArray[i];
        }

        return finalArray;

   }   
   public static void main(String args[]){
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the name : ");
      String name = input.next();
      
      // Call method to return the reverse string
      char [] result = removeDuplicates(name);
      System.out.print("Removed duplicate string : ");
      for(int i=0; i<result.length; i++){
         System.out.print(result[i]);
      }
      input.close();
   }
}
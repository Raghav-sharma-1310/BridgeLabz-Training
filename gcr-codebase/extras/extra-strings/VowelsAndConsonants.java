import java.util.*;
public class VowelsAndConsonants{
   // Method to count the number of consonants and vowels
   public static int[] countVowelAndConsonants(String name){
      int vowelCount = 0;
      int consonantsCount = 0;
      for(int i = 0; i<name.length(); i++){
         if(name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o' || name.charAt(i) == 'u'){
            vowelCount++;
         }
         else{
            consonantsCount++;
         }
      }
      return new int[]{vowelCount, consonantsCount}; 
   }
   public static void main(String args[]){
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the name : ");
      String name = input.next();
      
      // Call method to return the vowels and consonants
      int[] vowelAndConsonants = countVowelAndConsonants(name);

      System.out.println("The Number of vowels in "+ name + " is " + vowelAndConsonants[0] );

      System.out.println("The Number of consonants in "+ name + " is " + vowelAndConsonants[1] );
      input.close();
   }
}
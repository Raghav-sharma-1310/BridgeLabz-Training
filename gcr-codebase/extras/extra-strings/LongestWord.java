import java.util.*;
public class LongestWord{
   // Method to find word array
   public static String[] getWordArray(String sentence){
      int counter = 0;
      for(int i=0; i<sentence.length(); i++){
         if(sentence.charAt(i) == ' '){
            counter++;
         }
      }
      String[] tempString = new String[counter+1];
      String word = "";
      int index = 0;

      for (int i = 0; i < sentence.length(); i++) {
            char character = sentence.charAt(i);
            if (character != ' ')
                word += character;
            else {
                tempString[index++] = word;
                word = "";
            }
      }
      tempString[index] = word;
      return tempString;
   }
   
   // Method to get longest word
   public static String getLongestWord(String[] tempString){
         int wordCount = 0;
         String largestWord = tempString[wordCount];
         for(int i=0; i<tempString.length; i++){
            if(largestWord.length() < tempString[i].length()){
               largestWord = tempString[i];
            }
         }
         return largestWord;
   }
   public static void main(String args[]){
      Scanner input = new Scanner(System.in);
      String sentence = input.nextLine();
      String [] tempString = getWordArray(sentence);
      
     System.out.println("The largest word in this sentence : " + getLongestWord(tempString));
      
   }
}
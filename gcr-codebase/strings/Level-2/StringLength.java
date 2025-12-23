import java.util.*;
public class StringLength{

   // Finding length without using length()
   public static int getStringLength(String string){
       int counter = 0;
       try{
          while(true){
              string.charAt(counter);
              counter++;
          }
       }
       catch(StringIndexOutOfBoundsException e){
           return counter;
       }
   }

   // Finding length with using length()
   public static int getStringLengthByInbuilt(String string){
       int length = string.length();
       return length;
   }

   public static void main(String args[]){
       Scanner input = new Scanner(System.in);
       System.out.print("Enter the name : ");
       String text = input.next();

       System.out.println("The length of name : " + getStringLength(text));

       System.out.println("The length of name by length() : " + getStringLengthByInbuilt(text));
       
   }
}
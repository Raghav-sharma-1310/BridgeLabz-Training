import java.util.*;
// Creating class name EvenOddArray to find even and odd number between given number
public class EvenOddArray{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        
        // Taking even and odd number array to store even and odd numbers
        int evenNumber[] = new int[number / 2 + 1];
        int oddNumber[] = new int[number / 2 + 1];
        int evenIndex = 0;
        int oddIndex = 0;
        
        // Checking Natural number
        if(number > 0){
            
            // Finding even and odd number
            for(int i=1; i<=number; i++){
               if(i % 2 == 0){
                  evenNumber[evenIndex++]=i;
               }
               else{
                  oddNumber[oddIndex++]=i;
               }
            }

            // Displaying odd numbers
            System.out.print("Odd numbers : ");
            for (int i = 0; i < oddIndex; i++){
                  System.out.print(oddNumber[i] + " ");
            }

            // Displaying Even numbers
            System.out.print("\nEven number : ");
            for (int i = 0; i < evenIndex; i++){
                  System.out.print(evenNumber[i] + " ");
            }
        }
        else{
            System.out.println("Error");
        }
        
        input.close();
    }
}
import java.util.Scanner;
// Create a class with name FizzBuzzArray to find the multiples of 3 , 5 or both 
public class FizzBuzzArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        String[] result = new String[number];
       
        // Check Positive number
        if (number > 0) {

             // Store results in result array
             for (int i = 1; i <= number; i++) {
                 if (i % 3 == 0 && i % 5 == 0)
                     result[i - 1] = "FizzBuzz";
                 else if (i % 3 == 0)
                     result[i - 1] = "Fizz";
                 else if (i % 5 == 0)
                     result[i - 1] = "Buzz";
                 else
                     result[i - 1] = String.valueOf(i); //convert int to string
             }

             // Display the results
             for (int j = 0; j < result.length; j++) {
                 System.out.println("Position " + (j + 1) + " = " + result[j]);
             }
        }
        else{
           System.out.println("Invalid Input");
        }

        input.close();
    }
}

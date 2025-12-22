import java.util.*;

public class DemoNumberFormatException {

    // Method to generate NumberFormatException
    public static void generateException(String text) {
        int number = Integer.parseInt(text);
        System.out.println("Number: " + number);
    }

    // Method to handle NumberFormatException
    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Number: " + number);
        } 
        catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e);
        } 
        catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value: ");
        String text = input.nextLine();

        try {
            generateException(text);
        } 
        catch (Exception e) {
            System.out.println("Exception occurred in generateException()");
        }

        handleException(text);
        input.close();
    }
}

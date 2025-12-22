import java.util.*;

public class DemoArrayIndexOutOfBoundsException {

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateException(String[] names) {
        System.out.println(names[10]);
    }

    // Method to handle ArrayIndexOutOfBoundsException
    public static void handleException(String[] names) {
        try {
            System.out.println(names[10]);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e);
        } 
        catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of names: ");
        int n = input.nextInt();
        input.nextLine();

        String[] names = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = input.nextLine();
        }

        try {
            generateException(names);
        } 
        catch (Exception e) {
            System.out.print("Exception occurred : ");
        }

        handleException(names);
        input.close();
    }
}

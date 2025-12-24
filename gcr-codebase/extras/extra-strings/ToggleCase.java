import java.util.Scanner;

public class ToggleCase {

    // Method to toggle case of each character
    public static String toggleCase(String input) {
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                result += (char) (ch + 32);
            }
            else if (ch >= 'a' && ch <= 'z') {
                result += (char) (ch - 32);
            } else {
                result += ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String input = sc.nextLine();

        System.out.println("Toggled String: " + toggleCase(input));
    }
}

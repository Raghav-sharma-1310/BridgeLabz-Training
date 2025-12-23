import java.util.*;

public class CharacterTypeDisplay {
    // Check for character
    public static String checkCharacter(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }
        if (ch < 'a' || ch > 'z') return "Not a Letter";
        if ("aeiou".indexOf(ch) >= 0) return "Vowel";
        return "Consonant";
    }

    // Returns a 2D array containing every character
    public static String[][] analyzeCharacters(String text) {
        String[][] result = new String[text.length()][2];

        for (int i = 0; i < text.length(); i++) {
            result[i][0] = String.valueOf(text.charAt(i));
            result[i][1] = checkCharacter(text.charAt(i));
        }
        return result;
    }

    // Display the results in form of table
    public static void displayTable(String[][] data) {
        System.out.println("\nCHARACTER\tTYPE");
        for (String[] row : data) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[][] result = analyzeCharacters(text);
        displayTable(result);

        sc.close();
    }
}

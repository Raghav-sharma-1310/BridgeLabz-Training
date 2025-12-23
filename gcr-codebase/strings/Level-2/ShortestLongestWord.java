import java.util.Scanner;

public class ShortestLongestWord {

    // Find string length without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count++);
            }
        } catch (Exception e) {
            return count;
        }
    }

    // Split text into words using charAt()
    public static String[] splitWords(String text) {
        int wordCount = 1;
        for (int i = 0; i < findLength(text); i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        String word = "";
        int index = 0;

        for (int i = 0; i < findLength(text); i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                word += ch;
            } else {
                words[index++] = word;
                word = "";
            }
        }
        words[index] = word;
        return words;
    }

    // Create 2D array of word and length
    public static String[][] createWordLengthArray(String[] words) {
        String[][] data = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            data[i][0] = words[i];
            data[i][1] = String.valueOf(findLength(words[i]));
        }
        return data;
    }

    // Find shortest and longest word length
    public static int[] findShortestAndLongest(String[][] data) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (String[] row : data) {
            int len = Integer.parseInt(row[1]);
            if (len < min) min = len;
            if (len > max) max = len;
        }
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[][] data = createWordLengthArray(words);
        int[] result = findShortestAndLongest(data);

        System.out.println("\nWORD\tLENGTH");
        for (String[] row : data) {
            System.out.println(row[0] + "\t" + row[1]);
        }

        System.out.println("\nShortest Word Length: " + result[0]);
        System.out.println("Longest Word Length : " + result[1]);
    }
}

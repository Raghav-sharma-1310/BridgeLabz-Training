public class WordLength2D {
   
    // Method to find the length of string 
    public static int findLength(String text) {
        int c = 0;
        try { while (true) text.charAt(c++); }
        catch (Exception e) { return c; }
    }

    // Method to spilt words from sentense
    public static String[] splitWords(String text) {
        int count = 1;
        for (int i = 0; i < findLength(text); i++)
            if (text.charAt(i) == ' ') count++;

        String[] words = new String[count];
        String w = ""; int idx = 0;

        for (int i = 0; i < findLength(text); i++) {
            char ch = text.charAt(i);
            if (ch != ' ') w += ch;
            else { words[idx++] = w; w = ""; }
        }
        words[idx] = w;
        return words;
    }

    // Method to find word length 2D array 
    public static String[][] wordLength2D(String[] words) {
        String[][] arr = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            arr[i][0] = words[i];
            arr[i][1] = String.valueOf(findLength(words[i]));
        }
        return arr;
    }

    public static void main(String[] args) {
        String text = "Java is powerful";
        String[] words = splitWords(text);
        String[][] table = wordLength2D(words);

        System.out.println("WORD\tLENGTH");
        for (String[] row : table)
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
    }
}

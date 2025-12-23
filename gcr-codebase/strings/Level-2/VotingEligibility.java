import java.util.Random;

public class VotingEligibility {

    // Method to find random ages
    public static int[] generateAges(int n) {
        Random r = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = r.nextInt(90) + 1;
        }
        return ages;
    }

    // Check voting eligibility
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            result[i][1] = (ages[i] >= 18) ? "True" : "False";
        }
        return result;
    }

    // Method to display this in tabular format
    public static void displayTable(String[][] data) {
        System.out.println("AGE\tCAN VOTE");
        for (String[] row : data) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        int[] ages = generateAges(10);
        String[][] result = checkVotingEligibility(ages);
        displayTable(result);
    }
}

import java.util.Scanner;

public class RockPaperScissors {

    public static String computerChoice() {
        int r = (int) (Math.random() * 3);
        return r == 0 ? "Rock" : r == 1 ? "Paper" : "Scissors";
    }

    public static String findWinner(String user, String comp) {
        if (user.equals(comp)) return "Draw";
        if ((user.equals("Rock") && comp.equals("Scissors")) ||
            (user.equals("Paper") && comp.equals("Rock")) ||
            (user.equals("Scissors") && comp.equals("Paper"))) {
            return "User";
        }
        return "Computer";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int games = sc.nextInt();

        int userWins = 0, compWins = 0;

        System.out.println("\nGAME\tUSER\tCOMPUTER\tWINNER");
        for (int i = 1; i <= games; i++) {
            String user = "Rock";
            String comp = computerChoice();
            String winner = findWinner(user, comp);

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) compWins++;

            System.out.println(i + "\t" + user + "\t" + comp + "\t\t" + winner);
        }

        System.out.println("\nUser Win %     : " + (userWins * 100.0 / games));
        System.out.println("Computer Win % : " + (compWins * 100.0 / games));
    }
}
 
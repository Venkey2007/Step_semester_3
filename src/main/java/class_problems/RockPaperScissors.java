import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Player 1 choice (rock/paper/scissors): ");
        String player1 = sc.nextLine().toLowerCase();

        System.out.print("Enter Player 2 choice (rock/paper/scissors): ");
        String player2 = sc.nextLine().toLowerCase();

        if (player1.equals(player2)) {
            System.out.println("It's a draw!");
        } else if ((player1.equals("rock") && player2.equals("scissors")) ||
                   (player1.equals("paper") && player2.equals("rock")) ||
                   (player1.equals("scissors") && player2.equals("paper"))) {
            System.out.println("Player 1 wins!");
        } else {
            System.out.println("Player 2 wins!");
        }

        sc.close();
    }
}
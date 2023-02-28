import java.util.Scanner;

public class StoneScissorsPaper {
    public static void main(String[] args) {
        String[] computerMoves = {"rock", "paper", "scissors"};
        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("Please enter rock, paper, or scissors.");

        String computerMove = computerMoves[(int) (Math.random() * 3)];

        Scanner move = new Scanner(System.in);
        String humanMove = move.nextLine();
        System.out.println("Computer chose: " + computerMove);

        if (humanMove.equals(computerMove)) {
            System.out.println("It's a draw!");
        } else if (humanMove.equals("rock") && computerMove.equals("scissors")) {
            System.out.println("You win!");
        } else if (humanMove.equals("paper") && computerMove.equals("rock")) {
            System.out.println("You win!");
        } else if (humanMove.equals("scissors") && computerMove.equals("paper")) {
            System.out.println("You win!");
        } else if (humanMove.equals("rock") && computerMove.equals("paper")) {
            System.out.println("You lose!");
        } else if (humanMove.equals("paper") && computerMove.equals("scissors")) {
            System.out.println("You lose!");
        } else if (humanMove.equals("scissors") && computerMove.equals("rock")) {
            System.out.println("You lose!");

        }
    }
}

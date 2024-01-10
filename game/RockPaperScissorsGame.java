package game;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {
    public static void main(String[] args) {
        playRockPaperScissors();
    }

    public static void playRockPaperScissors() {
        String[] choices = {"Rock", "Paper", "Scissors"};

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.println("Enter your choice (Rock, Paper, or Scissors), or type 'exit' to end the game:");
            String userChoice = scanner.nextLine().toLowerCase();

            if (userChoice.equals("exit")) {
                System.out.println("Thanks for playing. Goodbye!");
                break;
            }

            if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                System.out.println("Invalid choice. Please enter Rock, Paper, or Scissors.");
                continue;
            }

            int computerIndex = random.nextInt(3);
            String computerChoice = choices[computerIndex];

            System.out.println("Computer choice: " + computerChoice);

            determineWinner(userChoice, computerChoice);
        }

        scanner.close();
    }

    public static void determineWinner(String userChoice, String computerChoice) {
        System.out.println("Your choice: " + userChoice);

        if (userChoice.equals(computerChoice)) {
            System.out.println("It's a tie!");
        } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }

        System.out.println();
    }
}

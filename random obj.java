import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Random random = new Random();
        int computerChoice = random.nextInt(3) + 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your choice (1 for rock, 2 for paper, 3 for scissors): ");
        int userChoice = scanner.nextInt();

        String computerChoiceString = "";
        String userChoiceString = "";

        switch (computerChoice) {
            case 1:
                computerChoiceString = "rock";
                break;
            case 2:
                computerChoiceString = "paper";
                break;
            case 3:
                computerChoiceString = "scissors";
                break;
        }

        switch (userChoice) {
            case 1:
                userChoiceString = "rock";
                break;
            case 2:
                userChoiceString = "paper";
                break;
            case 3:
                userChoiceString = "scissors";
                break;
        }

        System.out.println("Computer chose " + computerChoiceString + ". You chose " + userChoiceString + ".");

        if (computerChoice == userChoice) {
            System.out.println("It's a tie!");
        } else if ((computerChoice == 1 && userChoice == 2) || (computerChoice == 2 && userChoice == 3) || (computerChoice == 3 && userChoice == 1)) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }
    }
}

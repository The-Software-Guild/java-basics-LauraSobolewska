import java.util.Scanner;
import java.util.Random;


public class Main {

    public static void main(String[] args) {
        String stringRounds = "";
        int rounds = 0;
        String stringGameChoice = "";
        int gameChoice = 1;
        Random randomNumber = new Random();
        int randomNum = randomNumber.nextInt((3 - 1) + 1) + 1;
        int computerChoice = 1;
        String playerAnswer = "";
        Scanner scanner = new Scanner(System.in);
        boolean playGame = true;
        int computerScore = 0;
        int playerScore = 0;
        int totalRounds = 0;
        int ties = 0;

        do {
            System.out.println("How many rounds do you want to play?");
            try {
                stringRounds = scanner.nextLine();
                rounds = Integer.parseInt(stringRounds);
            } catch (NumberFormatException ex) {
                System.out.println("Input was not a valid number");
                break;
            }
            if ((rounds > 10) || (rounds < 1)) {
                System.out.println("Sorry, this is not a valid number of rounds.");
                return;
            } else {
                do {
                    System.out.println("Choose rock (1), paper (2), or scissors (3)");
                    stringGameChoice = scanner.nextLine();
                    gameChoice = Integer.parseInt(stringGameChoice);
                    computerChoice = randomNumber.nextInt(3);
                    if (gameChoice < computerChoice) {
                        computerScore = computerScore + 1;
                        System.out.println("Computer wins");
                    } else if (gameChoice == computerChoice) {
                        ties = ties + 1;
                        System.out.println("You tied with the computer");
                    } else if (gameChoice > computerChoice) {
                        playerScore = playerScore + 1;
                        System.out.println("You win!");
                    }
                    totalRounds += 1;
                }
                while (totalRounds < rounds);
                System.out.println("Your score is: " + playerScore);
                System.out.println("The computer's score is: " + computerScore);
                System.out.println("The number of ties is: " + ties);
            }
            System.out.println("Would you like to play again? Type Y or N");
            playerAnswer = scanner.nextLine();
            if (playerAnswer.equals("Y")){
                playGame = true;
            } else if (playerAnswer.equals("N")) {
                System.out.println("Thanks for playing!");
                break;
            }
            else {
                break;
            }
        }
        while (playGame == true);

    }
}


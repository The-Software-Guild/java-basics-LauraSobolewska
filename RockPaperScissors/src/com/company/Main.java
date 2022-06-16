import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    public static void Main(String[] args) {
        String stringRounds = "";
        int rounds = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many rounds do you want to play?");

        try {
            stringRounds = scanner.nextLine();
            rounds = Integer.parseInt(stringRounds);
        } catch (NumberFormatException ex) {
            System.out.println("Input was not a valid number");
        }
        if ((rounds > 10)||(rounds < 1)){
            System.out.println("Sorry, this is not a valid number of rounds.");}
    }

}

import java.util.Scanner;

public
class GuessNumberApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Game game = new Game();
        String playAgain;

        game.displayWelcomeMessage();

        do {
            game.generateNumberToBeGuessed();
            game.displayPleaseGuessMessage();

            boolean guessedCorrectly = false;

            while (!guessedCorrectly) {
                int userGuess = scanner.nextInt();
                game.makeGuess(userGuess);

                if (game.isCorrectGuess()) {
                    game.displayCorrectGuessMessage();
                    game.displayPerformanceMessage();
                    guessedCorrectly = true;
                } else {
                    game.displayGuessAgainMessage();
                }
            }

            System.out.println("Would you like to play again? (y/n)");
            playAgain = scanner.next();
        } while (playAgain.equalsIgnoreCase("y"));

        System.out.println("Thank you for playing!");
        scanner.close();
    }
}
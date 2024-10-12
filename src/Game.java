import java.util.Random;
import java.util.Scanner;

public class Game {
    private int number;
    private int guessNumber;
    private int counter;

    // Constructor to initialize counter
    public Game() {
        counter = 0;
    }

    // Generates a random number between 1 and 100
    public void generateNumberToBeGuessed() {
        Random rand = new Random();
        number = rand.nextInt(100) + 1;
    }

    // Receives the user's guess as a parameter and increments the counter
    public void makeGuess(int guess) {
        guessNumber = guess;
        counter++;
    }

    // Checks if the guess is correct
    public boolean isCorrectGuess() {
        return guessNumber == number;
    }

    // Displays welcome message
    public void displayWelcomeMessage() {
        System.out.println("Welcome to the Guessing Game!");
    }

    // Prompts the user to guess
    public void displayPleaseGuessMessage() {
        System.out.println("Please enter your guess (a number between 1 and 100): ");
    }

    // Displays correct guess message
    public void displayCorrectGuessMessage() {
        System.out.println("Congratulations! You guessed the number correctly in " + counter + " attempts.");
    }

    // Displays a message to guess again
    public void displayGuessAgainMessage() {
        if (guessNumber > number) {
            if (guessNumber - number > 10) {
                System.out.println("Way too high! Guess again.");
            } else {
                System.out.println("Too high! Guess again.");
            }
        } else {
            if (number - guessNumber > 10) {
                System.out.println("Way too low! Guess again.");
            } else {
                System.out.println("Too low! Guess again.");
            }
        }
    }

    // Displays feedback based on the number of tries
    public void displayPerformanceMessage() {
        if (counter <= 3) {
            System.out.println("Great work! You are a mathematical wizard.");
        } else if (counter <= 7) {
            System.out.println("Not too bad! You've got some potential.");
        } else {
            System.out.println("What took you so long?");
        }
    }
}
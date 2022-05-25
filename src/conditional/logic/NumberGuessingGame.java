package conditional.logic;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;

        boolean playerGuessedCorrectly = false;

        while (!playerGuessedCorrectly) {//while the player has not guessed correctly
            System.out.println("Enter your guess (1-100):");
            int playerGuess = scanner.nextInt();

            if (playerGuess == randomNumber) {
                System.out.println("Correct! You Win!");
                playerGuessedCorrectly = true;
            } else if (randomNumber > playerGuess) {
                System.out.println("Nope! The number is higher.");
            } else {
                System.out.println("Nope! The number is lower.");
            }
        }
    }
}

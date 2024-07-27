import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int maxAttempts = 5;
        int maxRounds = 3;
        int score = 0;

        System.out.println("Welcome to the Number Guessing Game!");

        for (int round = 1; round <= maxRounds; round++) {
            System.out.println("\nRound " + round);

            int targetNumber = random.nextInt(100) + 1;
            int attempts = 0;

            while (attempts < maxAttempts) {
                System.out.print("Guess the number (1-100): ");
                int guess = scanner.nextInt();

                attempts++;

                if (guess == targetNumber) {
                    System.out.println("Congratulations! You guessed the number correctly.");
                    score++;
                    break;
                } else if (guess < targetNumber) {
                    System.out.println("Your guess is too low.");
                } else {
                    System.out.println("Your guess is too high.");
                }

                if (attempts == maxAttempts && guess != targetNumber) {
                    System.out.println("Sorry, you have exceeded the maximum number of attempts.");
                    System.out.println("The correct number was: " + targetNumber);
                }
            }
        }

        System.out.println("\nGame Over!");
        System.out.println("Your final score: " + score + " out of " + maxRounds);

        scanner.close();
    }
}
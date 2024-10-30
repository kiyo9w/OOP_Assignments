import java.util.Random;
import java.util.Scanner;

public class RandomNumberGuessingGameEnhanced {

    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1; 
        Scanner scanner = new Scanner(System.in);
        int guess = 0;
        int guessCount = 0;
        System.out.println("Guess the random number between 1 and 100.");
        while (guess != randomNumber) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            guessCount++;
            if (guess > randomNumber) {
                System.out.println("Too high, try again.");
            } else if (guess < randomNumber) {
                System.out.println("Too low, try again.");
            } else {
                System.out.println("Congratulations! You guessed the correct number.");
                System.out.println("Number of guesses: " + guessCount);
            }
        }

        scanner.close();
    }
}
//4.18
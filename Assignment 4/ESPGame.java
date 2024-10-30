import java.util.Random;
import java.util.Scanner;

public class ESPGame {

    public static void main(String[] args) {
        String[] colors = {"Red", "Green", "Blue", "Orange", "Yellow"};
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int correctGuesses = 0; // Counter for correct guesses
        System.out.println("Welcome to the ESP Game!");
        System.out.println("Try to guess the color that the computer has selected.");
        System.out.println("Available colors: Red, Green, Blue, Orange, Yellow");
        for (int i = 0; i < 10; i++) {
            int colorIndex = random.nextInt(colors.length);
            String selectedColor = colors[colorIndex];
            System.out.print("Enter your guess: ");
            String userGuess = scanner.nextLine().trim();
            if (userGuess.equalsIgnoreCase(selectedColor)) {
                System.out.println("Correct!");
                correctGuesses++;
            } else {
                System.out.println("Incorrect. The correct color was: " + selectedColor);
            }
        }
        System.out.println("You guessed the correct color " + correctGuesses + " times out of 10.");
        scanner.close();
    }
}
//4.19
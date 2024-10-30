import java.util.Random;

public class DiceGame {

    public static void main(String[] args) {
        Random random = new Random();
        int computerWins = 0;
        int userWins = 0;
        System.out.println("Welcome to the Dice Game!");
        System.out.println("The game will be played for 10 rounds.");
        for (int i = 0; i < 10; i++) {
            int computerRoll = random.nextInt(6) + 1;
            int userRoll = random.nextInt(6) + 1;
            System.out.println("Round " + (i + 1) + ":");
            System.out.println("Computer rolled: " + computerRoll);
            System.out.println("User rolled: " + userRoll);
            if (computerRoll > userRoll) {
                System.out.println("Computer wins this round!");
                computerWins++;
            } else if (userRoll > computerRoll) {
                System.out.println("User wins this round!");
                userWins++;
            } else {
                System.out.println("It's a tie for this round!");
            }
            System.out.println();
        }
        System.out.println("Game Over!");
        System.out.println("Computer won " + computerWins + " rounds.");
        System.out.println("User won " + userWins + " rounds.");
        if (computerWins > userWins) {
            System.out.println("The grand winner is the Computer!");
        } else if (userWins > computerWins) {
            System.out.println("The grand winner is the User!");
        } else {
            System.out.println("The game is a tie!");
        }
    }
}
// 4.21
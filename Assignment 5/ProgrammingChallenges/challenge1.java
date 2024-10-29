package ProgrammingChallenges;
import java.util.Scanner;

public class challenge1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Input string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        //Input position
        int position;
        while (true) {
            System.out.print("Enter a position: ");
            position = scanner.nextInt();

            // Check if the position is valid
            if (position >= 0 && position < inputString.length()) {
                break;
            } else {
                System.out.println("Invalid position. Please enter a position between 0 and " + (inputString.length() - 1));
            }
        }

        // Call the showChar method with the user inputs
        showChar(inputString, position);

        scanner.close();
    }

    public static void showChar(String str, int position) {
        if (position >= 0 && position < str.length()) {
            char ch = str.charAt(position);
            System.out.println("The character at position " + position + " is " + ch);
        } else {
            System.out.println("Invalid position. Please enter a position between 0 and " + (str.length() - 1));
        }
    }
}

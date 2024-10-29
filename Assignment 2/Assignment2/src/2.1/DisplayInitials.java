import java.util.Scanner;

public class DisplayInitials {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        if (name.length() >= 2) {
            System.out.println("The first two letters of your name are: " + name.substring(0, 2));
        } else {
            System.out.println("Please enter a name with at least two characters.");
        }

        scanner.close();
    }
}
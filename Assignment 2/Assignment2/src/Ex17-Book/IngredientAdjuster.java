import java.util.Scanner;

public class IngredientAdjuster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double sugarPerCookie = 1.5 / 48;
        final double butterPerCookie = 1.0 / 48;
        final double flourPerCookie = 2.75 / 48;

        System.out.print("Enter the number of cookies you want to make: ");
        int cookiesWanted = scanner.nextInt();

        double sugarNeeded = sugarPerCookie * cookiesWanted;
        double butterNeeded = butterPerCookie * cookiesWanted;
        double flourNeeded = flourPerCookie * cookiesWanted;

        System.out.printf("For %d cookies, you need:\n", cookiesWanted);
        System.out.printf("%.2f cups of sugar\n", sugarNeeded);
        System.out.printf("%.2f cups of butter\n", butterNeeded);
        System.out.printf("%.2f cups of flour\n", flourNeeded);

        scanner.close();
    }
}
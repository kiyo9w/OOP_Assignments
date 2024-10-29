import java.util.Scanner;

public class ShippingCharges {
    public static void main(String[] args) {
        final double RATE_2_POUNDS = 1.10;
        final double RATE_2_TO_6_POUNDS = 2.20;
        final double RATE_6_TO_10_POUNDS = 3.70;
        final double RATE_10_POUNDS = 3.80;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the weight of the package (in pounds): ");
        double weight = input.nextDouble();
        System.out.print("Enter the distance to be shipped (in miles): ");
        int distance = input.nextInt();
        int increments = (int) Math.ceil(distance / 500.0);
        double rate;
        if (weight <= 2) {
            rate = RATE_2_POUNDS;
        } else if (weight <= 6) {
            rate = RATE_2_TO_6_POUNDS;
        } else if (weight <= 10) {
            rate = RATE_6_TO_10_POUNDS;
        } else {
            rate = RATE_10_POUNDS;
        }
        double totalCharges = rate * increments;
        System.out.printf("The shipping charges are: $"+totalCharges);
        input.close();
    }
}
//3.9
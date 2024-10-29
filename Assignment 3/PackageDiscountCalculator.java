import java.util.Scanner;

public class PackageDiscountCalculator {
    public static void main(String[] args) {
        final double PACKAGE_PRICE = 99.0;
        double discountRate = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of packages purchased: ");
        int quantity = input.nextInt();
        if (quantity >= 10 && quantity <= 19) {
            discountRate = 0.20;
        } else if (quantity >= 20 && quantity <= 49) {
            discountRate = 0.30;
        } else if (quantity >= 50 && quantity <= 99) {
            discountRate = 0.40;
        } else if (quantity >= 100) {
            discountRate = 0.50;
        }
        double discountAmount = quantity * PACKAGE_PRICE * discountRate;
        double totalAmount = (quantity * PACKAGE_PRICE) - discountAmount;
        System.out.println("Discount amount: $" + discountAmount);
        System.out.println("Total amount after discount: $" + totalAmount);
            
        input.close();
    }
}
//3.8
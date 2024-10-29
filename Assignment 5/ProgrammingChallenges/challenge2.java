package ProgrammingChallenges;

import java.util.Scanner;

public class challenge2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the wholesale cost
        System.out.print("Enter the item's wholesale cost: ");
        double wholesaleCost = scanner.nextDouble();

        //Input the markup percentage
        System.out.print("Enter the item's markup percentage: ");
        double markupPercentage = scanner.nextDouble();

        // Calculate the retail price
        double retailPrice = calculateRetail(wholesaleCost, markupPercentage);

        // Display the retail price
        System.out.printf("The item's retail price is: %.2f%n", retailPrice);

        scanner.close();
    }

    public static double calculateRetail(double wholesaleCost, double markupPercentage) {
        return wholesaleCost + (wholesaleCost * markupPercentage / 100);
    }
}


package ProgrammingChallenges;

import java.util.Scanner;

public class challenge4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of rooms
        int numberOfRooms = getValidIntInput(scanner, "Enter the number of rooms to be painted: ");

        // Input the price of the paint per gallon
        double pricePerGallon = getValidDoubleInput(scanner, "Enter the price of the paint per gallon: ");

        // Initialize total square feet
        double totalSquareFeet = 0;

        // Input the square feet of wall space for each room
        for (int i = 1; i <= numberOfRooms; i++) {
            totalSquareFeet += getValidDoubleInput(scanner, "Enter the square feet of wall space for room " + i + ": ");
        }

        // Calculate the required data
        double gallonsOfPaintRequired = calculateGallonsOfPaintRequired(totalSquareFeet);
        double hoursOfLaborRequired = calculateHoursOfLaborRequired(totalSquareFeet);
        double costOfPaint = calculateCostOfPaint(gallonsOfPaintRequired, pricePerGallon);
        double laborCharges = calculateLaborCharges(hoursOfLaborRequired);
        double totalCost = calculateTotalCost(costOfPaint, laborCharges);

        // Display the results
        System.out.printf("The numbers of gallons of paint required: %.2f%n", gallonsOfPaintRequired);
        System.out.printf("The hours of labor required: %.2f%n", hoursOfLaborRequired);
        System.out.printf("The cost of the paint: $%.2f%n", costOfPaint);
        System.out.printf("The labor charges: $%.2f%n", laborCharges);
        System.out.printf("The total cost of the paint job: $%.2f%n", totalCost);

        scanner.close();
    }

    public static int getValidIntInput(Scanner scanner, String prompt) {
        int input;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); // Clear the invalid input
            }
        }
        return input;
    }

    public static double getValidDoubleInput(Scanner scanner, String prompt) {
        double input;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                input = scanner.nextDouble();
                scanner.nextLine(); // Consume the newline character
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Clear the invalid input
            }
        }
        return input;
    }

    public static double calculateGallonsOfPaintRequired(double totalSquareFeet) {
        return totalSquareFeet / 115;
    }

    public static double calculateHoursOfLaborRequired(double totalSquareFeet) {
        return (totalSquareFeet / 115) * 8;
    }

    public static double calculateCostOfPaint(double gallonsOfPaintRequired, double pricePerGallon) {
        return gallonsOfPaintRequired * pricePerGallon;
    }

    public static double calculateLaborCharges(double hoursOfLaborRequired) {
        return hoursOfLaborRequired * 18.00;
    }

    public static double calculateTotalCost(double costOfPaint, double laborCharges) {
        return costOfPaint + laborCharges;
    }
}

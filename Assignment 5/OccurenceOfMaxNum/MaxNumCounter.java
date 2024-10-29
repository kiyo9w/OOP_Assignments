package OccurenceOfMaxNum;

import java.util.Scanner;

public class MaxNumCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("(The program will read integers input til the first 0)");
        System.out.println("Enter numbers:");
        findLargestAndCount(scanner);
        scanner.close();
    }

    public static void findLargestAndCount(Scanner scanner) {
        int max = 0;
        int count = 1;

        while (true) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (number == 0) {
                    break;
                }
                if (number > max) {
                    max = number;
                    count = 1;
                } else if (number == max) {
                    count++;
                }
            } else {
                System.out.println("Invalid input (not integers) ignored.");
                scanner.next(); // Clear the invalid input
            }
        }

        if (max != 0) {
            System.out.println("The largest number is " + max);
            System.out.println("The occurrence count of the largest number is " + count);
        } else {
            System.out.println("The largest number is 0");
            System.out.println("The occurrence count of the largest number is 1");
        }
    }
}

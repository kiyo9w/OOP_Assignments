
import java.util.Scanner;

public class MortgageTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        double loan = -1;
        while (loan <= 0) {
            System.out.print("Enter the loan amount (positive number): ");
            loan = scanner.nextDouble();
            if (loan <= 0) {
                System.out.println("Invalid input! Loan amount must be positive.");
            }
        }

     
        double rate = -1;
        while (rate <= 0) {
            System.out.print("Enter the annual interest rate (positive number): ");
            rate = scanner.nextDouble();
            if (rate <= 0) {
                System.out.println("Invalid input! Interest rate must be positive.");
            }
        }

      
        int years = -1;
        while (years <= 0) {
            System.out.print("Enter the number of years of the loan (positive number): ");
            years = scanner.nextInt();
            if (years <= 0) {
                System.out.println("Invalid input! Number of years must be positive.");
            }
        }

       
        Mortgage mortgage = new Mortgage(loan, rate, years);

       
        mortgage.displayLoanDetails();

       
        scanner.close();
    }
}

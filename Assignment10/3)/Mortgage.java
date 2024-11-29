
public class Mortgage {
    private double loan;
    private double rate;
    private int years;

   
    public Mortgage(double loan, double rate, int years) {
        this.loan = loan;
        this.rate = rate;
        this.years = years;
    }

   
    public void setLoan(double loan) {
        this.loan = loan;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setYears(int years) {
        this.years = years;
    }

   
    public double calculateMonthlyPayment() {
        double monthlyRate = rate / 100 / 12; 
        int totalMonths = years * 12; 
        double term = Math.pow(1 + monthlyRate, totalMonths); 

        
        double payment = (loan * monthlyRate * term) / (term - 1);
        return payment;
    }

    
    public double calculateTotalAmountPaid() {
        double monthlyPayment = calculateMonthlyPayment();
        int totalMonths = years * 12;
        return monthlyPayment * totalMonths;
    }

   
    public void displayLoanDetails() {
        double monthlyPayment = calculateMonthlyPayment();
        double totalPaid = calculateTotalAmountPaid();

        System.out.printf("Loan Amount: $%.2f\n", loan);
        System.out.printf("Annual Interest Rate: %.2f%%\n", rate);
        System.out.printf("Loan Term: %d years\n", years);
        System.out.printf("Monthly Payment: $%.2f\n", monthlyPayment);
        System.out.printf("Total Amount Paid: $%.2f\n", totalPaid);
    }
}

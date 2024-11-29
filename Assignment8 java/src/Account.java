public class Account {
    private double balance;
    private String accountNumber;

    public Account(String accNumber, double initialBalance) {
        accountNumber = accNumber;
        balance = initialBalance;
    }

    public void credit(double amount) {
        balance += amount;
    }

    public void debit(double amount) {
        if (amount > balance) {
            System.out.println("Debit amount exceeded account balance.");
        } else {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accNumber) {
        accountNumber = accNumber;
    }

    public void displayAccountInfo() {
        System.out.println("Account number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}
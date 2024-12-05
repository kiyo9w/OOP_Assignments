public class BankAccount {
    private double balance;

    // Constructor
    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    // Copy constructor
    public BankAccount(BankAccount account) {
        this.balance = account.balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public static void main(String[] args) {
        // Create a BankAccount object
        BankAccount account1 = new BankAccount(1000.0);

        // Create a copy of account1
        BankAccount account2 = new BankAccount(account1);

        // Display the balances
        System.out.println("Balance of account1: " + account1.getBalance());
        System.out.println("Balance of account2: " + account2.getBalance());
    }
}

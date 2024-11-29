public class ATM {
    public static void main(String[] args) {
        Account account1 = new Account("122100008121", 1000050);
        Account account2 = new Account("122100008121", 2000050);

        System.out.println("Before transactions:");
        account1.displayAccountInfo();
        account2.displayAccountInfo();

        account1.credit(1000050);
        account1.debit(2000000);
               
        account2.credit(2000050);
        account2.debit(2000000);
        
        System.out.println("After transaction:");
        account1.displayAccountInfo();
        account2.displayAccountInfo();
    }
}


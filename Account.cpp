#include<iostream>;
#include<string>;
#include"Account.h";
int main() {
    Account account1("122100008121", 1000050);
    Account account2("122100008122", 2000050);

    cout << "Initial Account Information:\n";
    cout << "Account Number: " << account1.getAccountNumber() << ", Balance: $" << account1.getBalance() << endl;
    cout << "Account Number: " << account2.getAccountNumber() << ", Balance: $" << account2.getBalance() << endl;

    cout << "\nAccount 1 Transactions:\n";
    account1.credit(1000000);
    cout << "After credit, Balance: $" << account1.getBalance() << endl;
    account1.debit(2000000);
    cout << "After debit, Balance: $" << account1.getBalance() << endl;

    cout << "\nAccount 2 Transactions:\n";
    account2.credit(1000000);
    cout << "After credit, Balance: $" << account2.getBalance() << endl;
    account2.debit(2000000);
    cout << "After debit, Balance: $" << account2.getBalance() << endl;

    return 0;
}
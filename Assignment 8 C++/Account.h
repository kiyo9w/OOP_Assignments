#pragma once
#include <iostream>
#include <string>

using namespace std;

class Account {
private:
    double balance;
    string accountNumber;

public:
    Account(const string& accNumber, double initialBalance)
        : accountNumber(accNumber), balance(initialBalance > 0 ? initialBalance : 0) {}

    void setAccountNumber(const string& accNumber) {
        accountNumber = accNumber;
    }

    string getAccountNumber() const {
        return accountNumber;
    }

    void credit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    void debit(double amount) {
        if (amount > balance) {
            cout << "Debit amount exceeded account balance." << endl;
        }
        else {
            balance -= amount;
        }
    }

    double getBalance() const {
        return balance;
    }
};
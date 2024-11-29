
#include <iostream>
#include "Mortgage.h"  
using namespace std;

int main() {
    double loan;
    double rate;
    int years;

  
    do {
        cout << "Enter the loan amount (positive number): ";
        cin >> loan;
        if (loan <= 0) {
            cout << "Invalid input! Loan amount must be positive." << endl;
        }
    } while (loan <= 0);


    do {
        cout << "Enter the annual interest rate (positive number): ";
        cin >> rate;
        if (rate <= 0) {
            cout << "Invalid input! Interest rate must be positive." << endl;
        }
    } while (rate <= 0);

   
    do {
        cout << "Enter the number of years of the loan (positive number): ";
        cin >> years;
        if (years <= 0) {
            cout << "Invalid input! Number of years must be positive." << endl;
        }
    } while (years <= 0);

  
    Mortgage mortgage(loan, rate, years);

    
    mortgage.displayLoanDetails();

    return 0;
}

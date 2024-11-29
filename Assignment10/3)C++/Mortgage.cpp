
#include <iostream>
#include <cmath>
#include "Mortgage.h"  

using namespace std;


Mortgage::Mortgage(double loan, double rate, int years) {
    this->loan = loan;
    this->rate = rate;
    this->years = years;
}


void Mortgage::setLoan(double loan) {
    this->loan = loan;
}

void Mortgage::setRate(double rate) {
    this->rate = rate;
}

void Mortgage::setYears(int years) {
    this->years = years;
}


double Mortgage::calculateMonthlyPayment() {
    double monthlyRate = rate / 100 / 12; 
    int totalMonths = years * 12; 
    double term = pow(1 + monthlyRate, totalMonths); 

  
    double payment = (loan * monthlyRate * term) / (term - 1);
    return payment;
}


double Mortgage::calculateTotalAmountPaid() {
    double monthlyPayment = calculateMonthlyPayment();
    int totalMonths = years * 12;
    return monthlyPayment * totalMonths; 
}


void Mortgage::displayLoanDetails() {
    double monthlyPayment = calculateMonthlyPayment();
    double totalPaid = calculateTotalAmountPaid();

    cout << "Loan Amount: $" << loan << endl;
    cout << "Annual Interest Rate: " << rate << "%" << endl;
    cout << "Loan Term: " << years << " years" << endl;
    cout << "Monthly Payment: $" << monthlyPayment << endl;
    cout << "Total Amount Paid: $" << totalPaid << endl;
}

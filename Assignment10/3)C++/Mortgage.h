
#ifndef MORTGAGE_H
#define MORTGAGE_H

class Mortgage {
private:
    double loan;   
    double rate;   
    int years;     

public:
  
    Mortgage(double loan, double rate, int years);

   
    void setLoan(double loan);
    void setRate(double rate);
    void setYears(int years);

   
    double calculateMonthlyPayment();

   
    double calculateTotalAmountPaid();

    
    void displayLoanDetails();
};

#endif 

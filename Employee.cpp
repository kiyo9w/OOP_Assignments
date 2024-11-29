#include <iostream>;
#include <string>;
#include "Employee.h";
int main() {
    Employee emp1("Quang", "Huy", 3000);
    Employee emp2("Obito", "Uchihahaha", 4000);

    cout << "Initial Yearly Salaries:\n";
    cout << emp1.getFirstName() << " " << emp1.getLastName() << ": $" << emp1.getYearlySalary() << endl;
    cout << emp2.getFirstName() << " " << emp2.getLastName() << ": $" << emp2.getYearlySalary() << endl;

    emp1.giveRaise(10);
    emp2.giveRaise(10);

    cout << "\nYearly Salaries After 10% Raise:\n";
    cout << emp1.getFirstName() << " " << emp1.getLastName() << ": $" << emp1.getYearlySalary() << endl;
    cout << emp2.getFirstName() << " " << emp2.getLastName() << ": $" << emp2.getYearlySalary() << endl;

    return 0;
}
#pragma once
#include <iostream>
#include <string>

using namespace std;

class Employee {
private:
    string firstName;
    string lastName;
    int monthlySalary;

public:
    Employee(const string& first, const string& last, int salary)
        : firstName(first), lastName(last), monthlySalary(salary > 0 ? salary : 0) {}

    void setFirstName(const string& first) {
        firstName = first;
    }

    void setLastName(const string& last) {
        lastName = last;
    }

    void setMonthlySalary(int salary) {
        monthlySalary = (salary > 0) ? salary : 0;
    }

    string getFirstName() const {
        return firstName;
    }

    string getLastName() const {
        return lastName;
    }

    int getMonthlySalary() const {
        return monthlySalary;
    }

    int getYearlySalary() const {
        return monthlySalary * 12;
    }

    void giveRaise(double percentage) {
        monthlySalary += static_cast<int>(monthlySalary * (percentage / 100.0));
    }
};
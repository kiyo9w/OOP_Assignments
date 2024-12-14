#ifndef DAYOFYEAR_H
#define DAYOFYEAR_H

#include <iostream>
#include <string>
using namespace std;

class DayOfYear {
private:
    int dayOfYear;                      
    static const int daysInMonth[];     
    static const string months[];       
    static const int totalDaysInYear;
    int calculateDayOfYear(const string& month, int day);
public:
    DayOfYear(const string& month, int day);
    DayOfYear& operator++();    
    DayOfYear operator++(int);  
    DayOfYear& operator--();    
    DayOfYear operator--(int);
    void print() const;
};

#endif
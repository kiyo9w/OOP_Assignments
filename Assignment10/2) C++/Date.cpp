#include "Date.h"
#include <iostream>
#include <string>

Date::Date(int day, int month, int year) : day(day), month(month), year(year) {}

int Date::getDay() const {
    return day;
}

int Date::getMonth() const {
    return month;
}

int Date::getYear() const {
    return year;
}

void Date::setDay(int day) {
    this->day = day;
}

void Date::setMonth(int month) {
    this->month = month;
}

void Date::setYear(int year) {
    this->year = year;
}


bool Date::isValid() const {
    if (month < 1 || month > 12 || day < 1 || day > 31) {
        return false;
    }

    
    if (month == 2) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {  
        }
        return day <= 28;
    }

    if (month == 4 || month == 6 || month == 9 || month == 11) {
        return day <= 30;
    }

    return true;
}


std::string Date::toString() const {
    return std::to_string(day) + "/" + std::to_string(month) + "/" + std::to_string(year);
}

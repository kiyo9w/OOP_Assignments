#include "DayOfYear.h"

const int DayOfYear::daysInMonth[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
const string DayOfYear::months[] = {
    "January", "February", "March", "April", "May", "June",
    "July", "August", "September", "October", "November", "December"
};
const int DayOfYear::totalDaysInYear = 365;

int DayOfYear::calculateDayOfYear(const string& month, int day) {
    int monthIndex = -1;
    for (int i = 0; i < 12; i++) {
        if (months[i] == month) {
            monthIndex = i;
            break;
        }
    }
    if (monthIndex == -1) {
        cout << "Invalid month name. Setting to Jan 1st" << endl;
        return -1;
    }
    if (day < 1 || day > daysInMonth[monthIndex]) {
        cout << "Invalid day for the given month. Setting to Jan 1st" << endl;
        return -1;
    }
    int dayOfYear = 0;
    for (int i = 0; i < monthIndex; i++) {
        dayOfYear += daysInMonth[i];
    }
    return dayOfYear + day;
}

DayOfYear::DayOfYear(const string& month, int day) {
    int calculatedDay = calculateDayOfYear(month, day);
    if (calculatedDay == -1) {
        dayOfYear = 1; 
    } else {
        dayOfYear = calculatedDay;
    }
}

DayOfYear& DayOfYear::operator++() {
    dayOfYear = (dayOfYear % totalDaysInYear) + 1; // Check if it overflows 365
    return *this;
}

DayOfYear DayOfYear::operator++(int) {
    DayOfYear temp = *this;
    ++(*this);
    return temp;
}

DayOfYear& DayOfYear::operator--() {
    dayOfYear = (dayOfYear == 1) ? totalDaysInYear : dayOfYear - 1; // Check if its first day of the year (Jan 1st)
    return *this;
}

DayOfYear DayOfYear::operator--(int) {
    DayOfYear temp = *this;
    --(*this);
    return temp;
}

void DayOfYear::print() const {
    int dayCounter = dayOfYear;
    for (int i = 0; i < 12; i++) {
        if (dayCounter <= daysInMonth[i]) {
            cout << months[i] << " " << dayCounter << endl;
            return;
        }
        dayCounter -= daysInMonth[i];
    }
}
#include <iostream>
#include "Date.h"


Date getNextDay(const Date &d) {
    int day = d.getDay();
    int month = d.getMonth();
    int year = d.getYear();

    
    day++;

    Date temp(day, month, year);

    
    if (!temp.isValid()) {
        day = 1;
        month++;
        temp.setDay(day);
        temp.setMonth(month);

        
        if (!temp.isValid()) {
            month = 1;
            year++;
            temp.setMonth(month);
            temp.setYear(year);
        }
    }
    return temp;
}


Date getPreviousDay(const Date &d) {
    int day = d.getDay();
    int month = d.getMonth();
    int year = d.getYear();

    
    day--;

    Date temp(day, month, year);

    
    if (!temp.isValid()) {
        month--;
        if (month < 1) {
            month = 12;
            year--;
        }

        
        temp.setMonth(month);
        temp.setYear(year);
        if (month == 2) {
            temp.setDay((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? 29 : 28);
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            temp.setDay(30);
        } else {
            temp.setDay(31);
        }
    }
    return temp;
}


Date getDateAfterOneYear(const Date &d) {
    int day = d.getDay();
    int month = d.getMonth();
    int year = d.getYear();

    year++;  
    Date temp(day, month, year);

    
    if (!temp.isValid()) {
       
        if (month == 2 && day == 29 && !(year % 4 == 0 && year % 100 != 0) && !(year % 400 == 0)) {
           
            temp.setDay(28);
        }
    }
    return temp;
}

int main() {
   
    Date date1(1, 1, 2012);  
    Date date2(31, 1, 2012);  
    Date date3(31, 12, 2012); 

    
    std::cout << "Current Date: " << date1.toString() << " | Next Day: " << getNextDay(date1).toString() << std::endl;
    std::cout << "Current Date: " << date2.toString() << " | Next Day: " << getNextDay(date2).toString() << std::endl;
    std::cout << "Current Date: " << date3.toString() << " | Next Day: " << getNextDay(date3).toString() << std::endl;

    
    Date prevDay = getPreviousDay(date1);
    std::cout << "Previous Day of 1/1/2012: " << prevDay.toString() << std::endl;

    
    Date leapYearDate(29, 2, 2012);
    Date nextYearDate = getDateAfterOneYear(leapYearDate);
    std::cout << "One year after 29/2/2012: " << nextYearDate.toString() << std::endl;

    return 0;
}

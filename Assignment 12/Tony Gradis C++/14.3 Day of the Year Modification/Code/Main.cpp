#include "DayOfYear.h"
#include <stdio.h>

int main() {
    DayOfYear today("December", 31);
    today.print(); 

    ++today;
    today.print();
    --today;
    today.print(); 

    DayOfYear anotherDay("February", 28);
    anotherDay.print();

    anotherDay--;
    anotherDay.print();
    anotherDay++;
    anotherDay.print();

    DayOfYear firstDayOfY("January", 1);
    firstDayOfY--;
    firstDayOfY.print();

    DayOfYear lastDayOfY("December", 31);
    lastDayOfY++;
    lastDayOfY.print();

    DayOfYear InvalidDay("February", 30);
    InvalidDay.print();

    DayOfYear InvalidMonth("Trung", 30);
    InvalidMonth.print();

    return 0;
}
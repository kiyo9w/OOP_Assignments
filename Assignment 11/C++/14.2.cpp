#include <iostream>
#include <string>

using namespace std;

class DayOfYear {
private:
    int day;
    static string months[12];
    static int daysInMonth[12];

public:
    // Constructor
    DayOfYear(int dayOfYear) : day(dayOfYear) {}

    // Function to print the day in month-day format
    void print() const {
        int month = 0;
        int dayOfMonth = day;

        while (dayOfMonth > daysInMonth[month]) {
            dayOfMonth -= daysInMonth[month];
            month++;
        }

        cout << months[month] << " " << dayOfMonth << endl;
    }
};

// Static member initialization
string DayOfYear::months[12] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
int DayOfYear::daysInMonth[12] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

int main() {
    int dayOfYear;

    // Loop until a valid day is entered
    do {
        cout << "Enter a day of the year (1-365): ";
        cin >> dayOfYear;

        if (dayOfYear < 1 || dayOfYear > 365) {
            cout << "Day out of range! Please try again." << endl;
        }
    } while (dayOfYear < 1 || dayOfYear > 365);

    DayOfYear day(dayOfYear);
    day.print();

    return 0;
}

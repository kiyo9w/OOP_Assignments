#include <iostream>
#include <string>

using namespace std;

class Numbers {
private:
    int number;
    static string lessThan20[20];
    static string tens[10];
    static string hundred;
    static string thousand;

public:
    // Constructor
    Numbers(int num) : number(num) {}

    // Function to print the English description of the number
    void print() const {
        if (number == 0) {
            cout << lessThan20[0] << endl;
            return;
        }

        string result;
        int tempNumber = number;

        if (tempNumber >= 1000) {
            result += lessThan20[tempNumber / 1000] + " " + thousand + " ";
            tempNumber %= 1000;
        }
        if (tempNumber >= 100) {
            result += lessThan20[tempNumber / 100] + " " + hundred + " ";
            tempNumber %= 100;
        }
        if (tempNumber >= 20) {
            result += tens[tempNumber / 10] + " ";
            tempNumber %= 10;
        }
        if (tempNumber > 0) {
            result += lessThan20[tempNumber] + " ";
        }

        cout << result << endl;
    }
};

// Static member initialization
string Numbers::lessThan20[20] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
string Numbers::tens[10] = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
string Numbers::hundred = "hundred";
string Numbers::thousand = "thousand";

int main() {
    int num;

    // Loop until a valid number is entered
    do {
        cout << "Enter a number between 0 and 9999: ";
        cin >> num;

        if (num < 0 || num > 9999) {
            cout << "Number out of range! Please try again." << endl;
        }
    } while (num < 0 || num > 9999);

    Numbers number(num);
    number.print();

    return 0;
}

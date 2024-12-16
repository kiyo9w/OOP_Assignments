#include "FeetInches.h"
#include <iostream>
using namespace std;

// Hàm simplify: chuyển inches > 12 thành feet
void FeetInches::simplify() {
    if (inches >= 12) {
        feet += inches / 12;
        inches %= 12;
    }
}

// Constructor
FeetInches::FeetInches(int f, int i) : feet(f), inches(i) {
    simplify();
}

// Hàm multiply: nhân 2 FeetInches để tính diện tích
FeetInches FeetInches::multiply(const FeetInches& other) {
    int total_inches_1 = feet * 12 + inches;
    int total_inches_2 = other.feet * 12 + other.inches;

    int total_square_inches = total_inches_1 * total_inches_2;

    int result_feet = total_square_inches / 144;
    int result_inches = (total_square_inches % 144) / 12;

    return FeetInches(result_feet, result_inches);
}

// Trả về số foot dưới dạng số thập phân
double FeetInches::toDouble() const {
    return feet + inches / 12.0;
}

// Hiển thị giá trị FeetInches
void FeetInches::display() const {
    cout << feet << " feet " << inches << " inches";
}

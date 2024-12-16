#include "FeetInches.h"
#include <cmath>
#include <iostream>

FeetInches::FeetInches(int ft, int in) : feet(ft), inches(in) {
    normalize();
}

void FeetInches::normalize() {
    if (inches >= 12) {
        feet += inches / 12;
        inches %= 12;
    } else if (inches < 0) {
        feet -= (std::abs(inches) / 12) + 1;
        inches = 12 - (std::abs(inches) % 12);
    }
}

int FeetInches::getFeet() const {
    return feet;
}

int FeetInches::getInches() const {
    return inches;
}

double FeetInches::multiply(const FeetInches& other) const {
    double thisFeet = feet + inches / 12.0;
    double otherFeet = other.feet + other.inches / 12.0;
    return thisFeet * otherFeet;
}

void FeetInches::display() const {
    std::cout << feet << " feet " << inches << " inches";
}
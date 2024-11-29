#include "Complex.h"
#include <iostream>

using namespace std;


Complex::Complex(double real, double imag) : real(real), imag(imag) {}


double Complex::getReal() const {
    return real;
}


void Complex::setReal(double real) {
    this->real = real;
}


double Complex::getImag() const {
    return imag;
}


void Complex::setImag(double imag) {
    this->imag = imag;
}


void Complex::setValue(double real, double imag) {
    this->real = real;
    this->imag = imag;
}


void Complex::print() const {
    cout << real;
    if (imag >= 0) {
        cout << " + " << imag << "i" << endl;
    } else {
        cout << " - " << -imag << "i" << endl;
    }
}


bool Complex::isReal() const {
    return imag == 0.0;
}


bool Complex::isImaginary() const {
    return real == 0.0;
}


Complex & Complex::addInto(const Complex & another) {
    this->real += another.real;
    this->imag += another.imag;
    return *this;
}


Complex & Complex::addInto(double real, double imag) {
    this->real += real;
    this->imag += imag;
    return *this;
}


Complex Complex::addReturnNew(const Complex & another) const {
    return Complex(this->real + another.real, this->imag + another.imag);
}


Complex Complex::addReturnNew(double real, double imag) const {
    return Complex(this->real + real, this->imag + imag);
}

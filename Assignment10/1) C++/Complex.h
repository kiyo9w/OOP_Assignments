#ifndef COMPLEX_H
#define COMPLEX_H

class Complex {
private:
    double real;
    double imag;

public:
    
    Complex(double real = 0.0, double imag = 0.0);

   
    double getReal() const;

    
    void setReal(double real);

    
    double getImag() const;

    
    void setImag(double imag);

    
    void setValue(double real, double imag);

    
    void print() const;

    
    bool isReal() const;

   
    bool isImaginary() const;

    
    Complex & addInto(const Complex & another);

    
    Complex & addInto(double real, double imag);

    
    Complex addReturnNew(const Complex & another) const;

    
    Complex addReturnNew(double real, double imag) const;
};

#endif

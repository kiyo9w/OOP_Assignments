#ifndef FEETINCHES_H
#define FEETINCHES_H

class FeetInches {
private:
    int feet;
    int inches;
    void normalize();
public:
    FeetInches(int ft = 0, int in = 0);
    int getFeet() const;
    int getInches() const;
    double multiply(const FeetInches& other) const;
    void display() const;
};

#endif
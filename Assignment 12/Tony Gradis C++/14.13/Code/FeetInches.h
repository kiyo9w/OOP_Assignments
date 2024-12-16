#ifndef FEETINCHES_H
#define FEETINCHES_H

class FeetInches {
private:
    int feet;
    int inches;
    void simplify(); // Hàm nội bộ để chuyển đổi inches > 12

public:
    FeetInches(int f = 0, int i = 0);
    FeetInches multiply(const FeetInches& other);
    double toDouble() const; // Chuyển thành số foot dạng thập phân
    void display() const;
};

#endif // FEETINCHES_H

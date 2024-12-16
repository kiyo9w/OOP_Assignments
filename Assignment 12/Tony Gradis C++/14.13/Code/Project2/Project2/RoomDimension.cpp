#include "RoomDimension.h"
#include <iostream>
using namespace std;

RoomDimension::RoomDimension(FeetInches l, FeetInches w) : length(l), width(w) {}

// Trả về diện tích phòng dưới dạng FeetInches
FeetInches RoomDimension::getArea() {
    return length.multiply(width);
}

// Hiển thị kích thước phòng
void RoomDimension::display() {
    cout << "Room Dimensions: ";
    length.display();
    cout << " x ";
    width.display();
    cout << endl;
}

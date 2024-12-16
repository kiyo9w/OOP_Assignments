#include "RoomDimension.h"
#include <iostream>

RoomDimension::RoomDimension(const FeetInches& len, const FeetInches& wid)
    : length(len), width(wid) {}

FeetInches RoomDimension::getLength() const {
    return length;
}

FeetInches RoomDimension::getWidth() const {
    return width;
}

double RoomDimension::getArea() const {
    return length.multiply(width);
}

void RoomDimension::display() const {
    std::cout << "Length: ";
    length.display();
    std::cout << ", Width: ";
    width.display();
}
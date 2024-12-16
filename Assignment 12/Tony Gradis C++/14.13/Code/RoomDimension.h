#ifndef ROOMDIMENSION_H
#define ROOMDIMENSION_H

#include "FeetInches.h"

class RoomDimension {
private:
    FeetInches length;
    FeetInches width;
public:
    RoomDimension(const FeetInches& len, const FeetInches& wid);
    FeetInches getLength() const;
    FeetInches getWidth() const;
    double getArea() const;
    void display() const;
};

#endif
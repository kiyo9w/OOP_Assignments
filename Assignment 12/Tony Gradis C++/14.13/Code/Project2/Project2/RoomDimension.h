#ifndef ROOMDIMENSION_H
#define ROOMDIMENSION_H

#include "FeetInches.h"

class RoomDimension {
private:
    FeetInches length;
    FeetInches width;

public:
    RoomDimension(FeetInches l, FeetInches w);
    FeetInches getArea(); // Tính diện tích phòng
    void display();       // Hiển thị kích thước phòng
};

#endif // ROOMDIMENSION_H

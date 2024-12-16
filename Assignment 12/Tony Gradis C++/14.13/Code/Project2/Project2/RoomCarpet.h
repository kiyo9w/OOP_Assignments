#ifndef ROOMCARPET_H
#define ROOMCARPET_H

#include "RoomDimension.h"

class RoomCarpet {
private:
    RoomDimension room;
    double pricePerSquareFoot;

public:
    RoomCarpet(RoomDimension r, double price);
    double getTotalCost(); // Tính tổng chi phí trải thảm
};

#endif // ROOMCARPET_H

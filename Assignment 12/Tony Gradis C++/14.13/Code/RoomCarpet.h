#ifndef ROOMCARPET_H
#define ROOMCARPET_H

#include "RoomDimension.h"

class RoomCarpet {
private:
    RoomDimension room;
    double costPerSquareFoot;
public:
    RoomCarpet(const RoomDimension& rd, double cost);
    double getTotalCost() const;
};

#endif
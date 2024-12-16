#include "RoomCarpet.h"
#include <iostream>
#include <iomanip>

RoomCarpet::RoomCarpet(const RoomDimension& rd, double cost)
    : room(rd), costPerSquareFoot(cost) {}

double RoomCarpet::getTotalCost() const {
    return room.getArea() * costPerSquareFoot;
}

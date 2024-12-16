#include "RoomCarpet.h"

RoomCarpet::RoomCarpet(RoomDimension r, double price) : room(r), pricePerSquareFoot(price) {}

// Tính tổng chi phí trải thảm
double RoomCarpet::getTotalCost() {
    return room.getArea().toDouble() * pricePerSquareFoot;
}

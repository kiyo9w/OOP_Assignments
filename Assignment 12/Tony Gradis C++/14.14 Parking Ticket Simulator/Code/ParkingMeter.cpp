#include "ParkingMeter.h"

ParkingMeter::ParkingMeter(int minutesPurchased) : purchasedMinutes(minutesPurchased) {}

int ParkingMeter::getPurchasedMinutes() const {
    return purchasedMinutes;
}
#include "PoliceOfficer.h"

PoliceOfficer::PoliceOfficer(const string& officerName, const string& badge) : name(officerName), badgeNumber(badge) {}

ParkingTicket* PoliceOfficer::inspectCar(const ParkedCar& car, const ParkingMeter& meter) const {
    int overParkedMinutes = car.getParkedMinutes() - meter.getPurchasedMinutes();
    if (overParkedMinutes > 0) {
        return new ParkingTicket(car, name, badgeNumber, overParkedMinutes);
    }
    return nullptr;
}
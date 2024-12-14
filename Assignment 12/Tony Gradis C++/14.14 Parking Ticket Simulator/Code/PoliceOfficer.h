#ifndef POLICEOFFICER_H
#define POLICEOFFICER_H

#include "ParkedCar.h"
#include "ParkingMeter.h"
#include "ParkingTicket.h"
#include <string>
using namespace std;

class PoliceOfficer {
private:
    string name;
    string badgeNumber;

public:
    PoliceOfficer(const string& officerName, const string& badge);
    ParkingTicket* inspectCar(const ParkedCar& car, const ParkingMeter& meter) const;
};

#endif
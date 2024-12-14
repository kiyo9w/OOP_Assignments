#ifndef PARKINGTICKET_H
#define PARKINGTICKET_H

#include "ParkedCar.h"
#include <string>
using namespace std;

class ParkingTicket {
private:
    string carMake;
    string carModel;
    string carColor;
    string licenseNumber;
    string officerName;
    string officerBadgeNumber;
    int fine;
    void calculateFine(int overParkedMinutes);

public:
    ParkingTicket(const ParkedCar& car, const string& officer, const string& badge, int overParkedMinutes);
    void printTicket() const;
};

#endif
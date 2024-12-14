#include "ParkedCar.h"
#include "ParkingMeter.h"
#include "ParkingTicket.h"
#include "PoliceOfficer.h"
#include <iostream>
using namespace std;

void checkTicket(const ParkedCar& car, const ParkingMeter& meter, const PoliceOfficer& officer) {
    ParkingTicket* ticket = officer.inspectCar(car, meter);
    if (ticket != nullptr) {
        ticket->printTicket();
        delete ticket;
    } else {
        cout << "No ticket issued. The car is legally parked.\n";
    }
}

int main() {
    ParkedCar carValid("Toyota", "Corona", "White", "ABC123", 59);
    ParkedCar carFined("Toyota", "Corona", "White", "ABC124", 125);
    ParkingMeter meter(60);
    PoliceOfficer officer("Ngo Trung", "342FHCB7");

    checkTicket(carValid, meter, officer);
    cout << "\n";
    checkTicket(carFined, meter, officer);

    return 0;
}
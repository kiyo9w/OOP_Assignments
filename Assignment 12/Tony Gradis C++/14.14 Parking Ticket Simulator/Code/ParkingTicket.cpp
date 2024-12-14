#include "ParkingTicket.h"
#include <iostream>
#include <cmath>

ParkingTicket::ParkingTicket(const ParkedCar& car, const string& officer, const string& badge, int overParkedMinutes)
    : carMake(car.getMake()), carModel(car.getModel()), carColor(car.getColor()),
      licenseNumber(car.getLicenseNumber()), officerName(officer), officerBadgeNumber(badge) {
    calculateFine(overParkedMinutes);
}

void ParkingTicket::calculateFine(int overParkedMinutes) {
    int hours = static_cast<int>(ceil(overParkedMinutes / 60.0)); // rounding up
    fine = 25 + (hours - 1) * 10;
}

void ParkingTicket::printTicket() const {
    std::cout << "Parking Ticket:\n"
              << "Car Make: " << carMake << "\n"
              << "Car Model: " << carModel << "\n"
              << "Car Color: " << carColor << "\n"
              << "License Number: " << licenseNumber << "\n"
              << "Fine Amount: $" << fine << "\n"
              << "Issued By: Officer " << officerName << " (Badge " << officerBadgeNumber << ")\n";
}
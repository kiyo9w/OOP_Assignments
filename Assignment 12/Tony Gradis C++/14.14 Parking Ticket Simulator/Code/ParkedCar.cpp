#include "ParkedCar.h"

ParkedCar::ParkedCar(const string& carMake, const string& carModel, const string& carColor, const string& license, int minutesParked)
    : make(carMake), model(carModel), color(carColor), licenseNumber(license), parkedMinutes(minutesParked) {}

string ParkedCar::getMake() const {
    return make;
}

string ParkedCar::getModel() const {
    return model;
}

string ParkedCar::getColor() const {
    return color;
}

string ParkedCar::getLicenseNumber() const {
    return licenseNumber;
}

int ParkedCar::getParkedMinutes() const {
    return parkedMinutes;
}
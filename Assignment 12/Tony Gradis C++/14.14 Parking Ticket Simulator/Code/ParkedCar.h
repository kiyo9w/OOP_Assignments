#ifndef PARKEDCAR_H
#define PARKEDCAR_H

#include <string>
using namespace std;

class ParkedCar {
private:
    string make;
    string model;
    string color;
    string licenseNumber;
    int parkedMinutes;

public:
    ParkedCar(const string& carMake, const string& carModel, const string& carColor, const string& license, int minutesParked);
    string getMake() const;
    string getModel() const;
    string getColor() const;
    string getLicenseNumber() const;
    int getParkedMinutes() const;
};

#endif
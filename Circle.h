#pragma once
#include <iostream>
#include <string>
#include <cmath>

using namespace std;

class Circle {
private:
    double radius;
    string color;

public:
    Circle() : radius(0.0), color("undefined") {}

    Circle(double r, const string& c) : radius(r), color(c) {}

    double getRadius() const {
        return radius;
    }

    void setRadius(double r) {
        radius = r;
    }

    string getColor() const {
        return color;
    }

    void setColor(const string& c) {
        color = c;
    }

    double getArea() const {
        return 3.14 * radius * radius;
    }
};
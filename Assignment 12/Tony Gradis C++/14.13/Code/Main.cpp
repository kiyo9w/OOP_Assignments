#include <iostream>
#include <iomanip>
#include "FeetInches.h"
#include "RoomDimension.h"
#include "RoomCarpet.h"

int main() {
    int lengthFeet, lengthInches;
    int widthFeet, widthInches;
    double pricePerSqFt;

    std::cout << "Enter the length of the room.\n";
    std::cout << "Feet: ";
    std::cin >> lengthFeet;
    std::cout << "Inches: ";
    std::cin >> lengthInches;

    std::cout << "\nEnter the width of the room.\n";
    std::cout << "Feet: ";
    std::cin >> widthFeet;
    std::cout << "Inches: ";
    std::cin >> widthInches;

    std::cout << "\nEnter the price of the carpet per square foot: $";
    std::cin >> pricePerSqFt;

    FeetInches length(lengthFeet, lengthInches);
    FeetInches width(widthFeet, widthInches);
    RoomDimension room(length, width);
    RoomCarpet carpet(room, pricePerSqFt);

    double area = room.getArea();
    double totalCost = carpet.getTotalCost();

    std::cout << "\nRoom Dimensions:\n";
    room.display();
    std::cout << "\nArea: " << std::fixed << std::setprecision(2) << area << " square feet";
    std::cout << "\nTotal cost of " << area << " area: $" << totalCost << "\n";

    return 0;
}
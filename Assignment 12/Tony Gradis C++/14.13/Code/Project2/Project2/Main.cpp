#include <iostream>
#include "FeetInches.h"
#include "RoomDimension.h"
#include "RoomCarpet.h"

using namespace std;

int main() {
    int lengthFeet, lengthInches, widthFeet, widthInches;
    double price;

    // Nhập dữ liệu từ người dùng
    cout << "Enter the length of the room (feet inches): ";
    cin >> lengthFeet >> lengthInches;
    cout << "Enter the width of the room (feet inches): ";
    cin >> widthFeet >> widthInches;
    cout << "Enter the price per square foot: $";
    cin >> price;

    // Tạo các đối tượng
    FeetInches length(lengthFeet, lengthInches);
    FeetInches width(widthFeet, widthInches);
    RoomDimension roomDim(length, width);
    RoomCarpet carpet(roomDim, price);

    // Hiển thị kết quả
    roomDim.display();
    cout << "Total cost of carpet: $" << carpet.getTotalCost() << endl;

    return 0;
}

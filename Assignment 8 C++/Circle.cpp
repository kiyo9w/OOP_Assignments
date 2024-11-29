#include <iostream>;
#include <string>;
#include"Circle.h";
int main() {
    double userRadius;
    string userColor;

    cout << "Enter  radius : ";
    cin >> userRadius;

    while (true) {
        cout << "Enter  color (red or blue): ";
        cin >> userColor;

        if (userColor == "red" || userColor == "blue") {
            break;
        }
        else {
            cout << "Invalid color. Please enter 'red' or 'blue'." << endl;
        }
    }

    Circle myCircle(userRadius, userColor);

    cout << "\nCircle Details:\n";
    cout << "Color: " << myCircle.getColor() << endl;
    cout << "Area: " << myCircle.getArea() << endl;

    return 0;
}
#include <iostream>
#include "Complex.h"

int main() {
    Complex c1(2.0, 3.0);
    Complex c2(1.0, 4.0);
    Complex c3 = c1.addReturnNew(c2); 
    c1.print();
    c2.print();
    c3.print();

   
    c1.addInto(c2);
    c1.print();

    return 0;
}

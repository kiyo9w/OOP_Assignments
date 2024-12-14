package carpetCalculator.Code;
import java.util.Scanner;

public class CarpetCalculator {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the length of the room (m): ");
    double length = sc.nextDouble();
    System.out.print("Enter the width of the room (m): ");
    double width = sc.nextDouble();

    RoomDimension myRoom = new RoomDimension(length, width);
    System.out.println("Room entered area (m^2): " + myRoom.getRoomArea());

    System.out.print("Enter the price per square (₫): ");
    double pricePerSquare = sc.nextDouble();

    RoomCarpet myCarpet = new RoomCarpet(myRoom, pricePerSquare);
    System.out.println("Price for " + myRoom.getRoomArea() + " room area: " + myCarpet.getTotalCost() + "₫");
    }
}

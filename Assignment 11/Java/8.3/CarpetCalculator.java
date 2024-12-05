import java.util.Scanner;

public class CarpetCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the dimensions
        System.out.print("Enter the length of the room in feet: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the room in feet: ");
        double width = scanner.nextDouble();

        // Create a RoomDimension object
        RoomDimension roomDimension = new RoomDimension(length, width);

        // Get the cost per square foot of the carpet
        System.out.print("Enter the cost per square foot of the carpet: ");
        double costPerSquareFoot = scanner.nextDouble();

        // Create a RoomCarpet object
        RoomCarpet roomCarpet = new RoomCarpet(roomDimension, costPerSquareFoot);

        // Display the total cost
        System.out.println("The total cost of the carpet: $" + roomCarpet.getTotalCost());
    }
}

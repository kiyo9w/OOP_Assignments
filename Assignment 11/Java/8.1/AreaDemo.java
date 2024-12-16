import java.util.Scanner;

public class AreaDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select a shape to calculate the area:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Cylinder");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                // Circle
                System.out.print("Enter the radius of the circle: ");
                double radiusCircle = scanner.nextDouble();
                double circleArea = Area.calculateArea(radiusCircle);
                System.out.printf("The area of the circle is: %.2f\n", circleArea);
                break;

            case 2:
                // Rectangle
                System.out.print("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                double rectangleArea = Area.calculateArea(width, length);
                System.out.printf("The area of the rectangle is: %.2f\n", rectangleArea);
                break;

            case 3:
                // Cylinder
                System.out.print("Enter the radius of the cylinder: ");
                double radiusCylinder = scanner.nextDouble();
                System.out.print("Enter the height of the cylinder: ");
                double height = scanner.nextDouble();
                double cylinderArea = Area.calculateArea(radiusCylinder, height, true);
                System.out.printf("The area of the cylinder is: %.2f\n", cylinderArea);
                break;

            default:
                System.out.println("Invalid choice! Please select 1, 2, or 3.");
        }

        scanner.close();
    }
}

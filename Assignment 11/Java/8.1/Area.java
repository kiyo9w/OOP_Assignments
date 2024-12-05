public class Area {

    //Area of a circle
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    //Area of a rectangle
    public static double calculateArea(double width, double length) {
        return width * length;
    }

    //Area of a cylinder
    public static double calculateArea(double radius, double height, boolean isCylinder) {
        return Math.PI * radius * radius * height;
    }

    public static void main(String[] args) {
        // Demonstrate the class
        double circleArea = calculateArea(3.0);
        double rectangleArea = calculateArea(4.0, 5.0);
        double cylinderArea = calculateArea(6.0, 7.0, true);

        System.out.println("Area of the circle: " + circleArea);
        System.out.println("Area of the rectangle: " + rectangleArea);
        System.out.println("Area of the cylinder: " + cylinderArea);
    }
}

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
}

class RoomDimension {
    private double length;
    private double width;

    // Constructor
    public RoomDimension(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }
}

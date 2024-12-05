class RoomCarpet {
    private RoomDimension dimension;
    private double costPerSquareFoot;

    // Constructor
    public RoomCarpet(RoomDimension dimension, double costPerSquareFoot) {
        this.dimension = dimension;
        this.costPerSquareFoot = costPerSquareFoot;
    }

    public double getTotalCost() {
        return dimension.getArea() * costPerSquareFoot;
    }
}

package carpetCalculator.Code;

public class RoomCarpet {
    private RoomDimension roomDimension;
    private double costPerSqF = 0;

    public RoomCarpet(RoomDimension roomDimension, double costPerSqF) {
        this.roomDimension = roomDimension;
        if (costPerSqF > 0) {
            this.costPerSqF = costPerSqF;
        }
    }

    public double getTotalCost() {
        return costPerSqF * roomDimension.getRoomArea();
    }
}
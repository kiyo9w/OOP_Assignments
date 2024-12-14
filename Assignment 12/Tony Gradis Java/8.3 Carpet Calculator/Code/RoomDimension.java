package carpetCalculator.Code;

public class RoomDimension {
    private double roomLength = 0;
    private double roomWidth = 0;

    RoomDimension(double roomLength, double roomWidth) {
        if (roomLength > 0) {
            this.roomLength = roomLength;
        }
        if (roomWidth > 0) {
            this.roomWidth = roomWidth;
        }
    }

    public double getRoomArea() {
        return roomLength * roomWidth;
    }
}
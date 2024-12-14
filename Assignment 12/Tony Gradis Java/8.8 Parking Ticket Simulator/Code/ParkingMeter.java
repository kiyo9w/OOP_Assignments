package Code;

public class ParkingMeter {
    private int purchasedMinutes;

    public ParkingMeter(int purchasedMinutes) {
        if (purchasedMinutes >= 0) {
            this.purchasedMinutes = purchasedMinutes;
        } else {
            this.purchasedMinutes = 0;
        }
    }

    public int getPurchasedMinutes() {
        return purchasedMinutes;
    }
}
package Code;

public class PoliceOfficer {
    private String name;
    private String badgeNumber;

    public PoliceOfficer(String name, String badgeNumber) {
        this.name = name;
        this.badgeNumber = badgeNumber;
    }

    public ParkingTicket inspectCar(ParkedCar car, ParkingMeter meter) {
        int overParkedMinutes = car.getParkedMinutes() - meter.getPurchasedMinutes();
        if (overParkedMinutes > 0) {
            return new ParkingTicket(car, name, badgeNumber, overParkedMinutes);
        }
        return null;
    }
}
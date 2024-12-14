package Code;

public class ParkingTicket {
    private String carMake;
    private String carModel;
    private String carColor;
    private String licenseNumber;
    private String officerName;
    private String officerBadgeNumber;
    private int fine;

    public ParkingTicket(ParkedCar car, String officerName, String officerBadgeNumber, int overParkedMinutes) {
        this.carMake = car.getMake();
        this.carModel = car.getModel();
        this.carColor = car.getColor();
        this.licenseNumber = car.getLicenseNumber();
        this.officerName = officerName;
        this.officerBadgeNumber = officerBadgeNumber;

        calculateFine(overParkedMinutes);
    }

    private void calculateFine(int overParkedMinutes) {
        int hours = (int) Math.ceil(overParkedMinutes / 60.0);
        fine = 25 + (hours - 1) * 10;
    }

    public String getTicketDetails() {
        return  "\n" +
                "Parking Ticket:\n" +
                "Car Make: " + carMake + "\n" +
                "Car Model: " + carModel + "\n" +
                "Car Color: " + carColor + "\n" +
                "License Number: " + licenseNumber + "\n" +
                "Fine Amount: $" + fine + "\n" +
                "Issued By: Officer " + officerName + ", Badge Number: " + officerBadgeNumber;
    }
}
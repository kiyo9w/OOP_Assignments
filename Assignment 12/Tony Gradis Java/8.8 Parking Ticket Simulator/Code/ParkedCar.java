package Code;

public class ParkedCar {
    private String make;
    private String model;
    private String color;
    private String licenseNumber;
    private int parkedMinutes;

    public ParkedCar(String make, String model, String color, String licenseNumber, int parkedMinutes) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.licenseNumber = licenseNumber;
        if (parkedMinutes >= 0) {
            this.parkedMinutes = parkedMinutes;
        } else {
            this.parkedMinutes = 0;
        }
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public int getParkedMinutes() {
        return parkedMinutes;
    }
}
package Code;

import java.util.Scanner;

public class ParkingTicketSimulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the car's make: ");
        String make = sc.nextLine();
        System.out.print("Enter the car's model: ");
        String model = sc.nextLine();
        System.out.print("Enter the car's color: ");
        String color = sc.nextLine();
        System.out.print("Enter the car's license number: ");
        String licenseNumber = sc.nextLine();
        System.out.print("Enter the number of minutes the car has been parked: ");
        int parkedMinutes = sc.nextInt();

        ParkedCar car = new ParkedCar(make, model, color, licenseNumber, parkedMinutes);

        System.out.print("Enter the number of purchased parking minutes: ");
        int purchasedMinutes = sc.nextInt();
        ParkingMeter meter = new ParkingMeter(purchasedMinutes);

        System.out.print("Enter the officer's name: ");
        sc.nextLine();
        String officerName = sc.nextLine();
        System.out.print("Enter the officer's badge number: ");
        String badgeNumber = sc.nextLine();
        PoliceOfficer officer = new PoliceOfficer(officerName, badgeNumber);

        ParkingTicket ticket = officer.inspectCar(car, meter);
        if (ticket != null) {
            System.out.println(ticket.getTicketDetails());
        } else {
            System.out.println("No ticket issued. The car is legally parked.");
        }

        sc.close();
    }
}
package carClass;

public class Main {
    public static void main(String[] args) {
        // Create a Car object
        Car car = new Car(2023, "Toyota");

        // Accelerate the car five times and display the speed after each acceleration
        System.out.println("Accelerating...");
        for (int i = 1; i <= 5; i++) {
            car.accelerate();
            System.out.println("Current speed after acceleration " + i + ": " + car.getSpeed() + " mph");
        }

        // Brake the car five times and display the speed after each brake
        System.out.println("\nBraking...");
        for (int i = 1; i <= 5; i++) {
            car.brake();
            System.out.println("Current speed after brake " + i + ": " + car.getSpeed() + " mph");
        }
    }

}

import java.util.Scanner;

public class Temperature {
    private double ftemp;

    Temperature(double ftemp) {
        this.ftemp = ftemp;
    }
    public double getFahrenheit() {
        return ftemp;
    }
    public double getCelsius(){
        return (5.0 / 9) * (ftemp - 32);
    }
    public double getKelvin(){
        return ((5.0 / 9) * (ftemp - 32)) + 273;
    }

    public void setFahrenheit(double Fahrenheit) {
        this.ftemp = Fahrenheit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a temperature in Fahrenheit: ");
        double ftemp = sc.nextDouble();

        Temperature temp = new Temperature(ftemp);

        System.out.println("Temperature in Fahrenheit: " + temp.getFahrenheit());
        System.out.printf("Temperature in Celsius: %.2f\n", temp.getCelsius());
        System.out.printf("Temperature in Kelvin: %.2f\n", temp.getKelvin());

        sc.close();
    }
}

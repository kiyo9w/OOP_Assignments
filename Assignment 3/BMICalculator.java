import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        
        final double POUNDS_TO_KG = 0.45359237;
        final double INCHES_TO_METERS = 0.0254;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your weight in pounds: ");
        double weightPounds = input.nextDouble();
        System.out.print("Enter your height in inches: ");
        double heightInches = input.nextDouble();
        double weightKg = weightPounds * POUNDS_TO_KG;
        double heightMeters = heightInches * INCHES_TO_METERS;
        double bmi = weightKg / (heightMeters * heightMeters);
        System.out.printf("Your BMI is: %.2f\n", bmi);

        if (bmi < 18.5) {
            System.out.println("Category: Underweight");
        } else if (bmi < 25.0) {
            System.out.println("Category: Normal");
        } else if (bmi < 30.0) {
            System.out.println("Category: Overweight");
        } else {
            System.out.println("Category: Obese");
        }

       
        input.close();
    }
}
// 1
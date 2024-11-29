import java.util.Scanner;
public class CircleTest {
    public static void main(String[] args) {
        
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Enter radius: ");
            double radius = scanner.nextDouble();
            scanner.nextLine();
    
            String color = "";
            boolean validColor = false;
            while (!validColor) {
                System.out.print("Enter color (red or blue): ");
                color = scanner.nextLine().toLowerCase();
                if (color.equals("red") || color.equals("blue")) {
                    validColor = true;
                } else {
                    System.out.println("Invalid color. Please enter 'red' or 'blue'.");
                }
            }
    
            Circle circle = new Circle(radius, color);
    
            System.out.printf("The  area is: %.2f\n", circle.getArea());
            System.out.println("The  color is: " + circle.getColor());
    
            scanner.close();
        }
    }


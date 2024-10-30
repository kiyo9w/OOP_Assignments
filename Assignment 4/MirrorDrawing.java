import java.util.Scanner;

public class MirrorDrawing {

    public static void drawMirror(int width, int height) {
        if (width % 2 != 0 || height % 2 != 0) {
            System.out.println("Please enter even numbers for width and height.");
            return;
        }
        System.out.print("#");
        for (int i = 0; i < width - 2; i++) {
            System.out.print("=");
        }
        System.out.println("#");
        int halfHeight = (height - 2) / 2;
        for (int i = 0; i < halfHeight; i++) {
            System.out.print("|");
            for (int j = 0; j < halfHeight - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.print("<>");
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print(".");
            }
            System.out.print("<>");
            for (int j = 0; j < halfHeight - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
        for (int i = halfHeight - 1; i >= 0; i--) {
            System.out.print("|");
            for (int j = 0; j < halfHeight - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.print("<>");
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print(".");
            }
            System.out.print("<>");
            for (int j = 0; j < halfHeight - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
        System.out.print("#");
        for (int i = 0; i < width - 2; i++) {
            System.out.print("=");
        }
        System.out.println("#");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width of the mirror (even number): ");
        int width = scanner.nextInt();
        System.out.print("Enter the height of the mirror (even number): ");
        int height = scanner.nextInt();
        drawMirror(width, height);
        scanner.close();
    }
}
//1
import java.util.Scanner;

public class RainfallDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] rainfall = new double[12];

        System.out.println("Enter the total rainfall for each month:");

        // Nhập số liệu lượng mưa với kiểm tra input
        for (int i = 0; i < 12; i++) {
            while (true) {
                System.out.print("Month " + (i + 1) + ": ");
                rainfall[i] = input.nextDouble();
                if (rainfall[i] < 0) {
                    System.out.println("Rainfall cannot be negative. Please enter a valid number.");
                } else {
                    break;
                }
            }
        }

        // Tạo đối tượng Rainfall và gọi các phương thức
        Rainfall rainData = new Rainfall(rainfall);

        // Hiển thị kết quả
        System.out.printf("Total Rainfall: %.2f\n", rainData.getTotalRainfall());
        System.out.printf("Average Monthly Rainfall: %.2f\n", rainData.getAverageRainfall());
        System.out.println("Month with Most Rain: " + rainData.getMonthWithMostRain());
        System.out.println("Month with Least Rain: " + rainData.getMonthWithLeastRain());

        input.close();
    }
}

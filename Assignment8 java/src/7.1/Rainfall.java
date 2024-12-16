public class Rainfall {
    private double[] monthlyRainfall;

    // Constructor với input validation
    public Rainfall(double[] rainfall) {
        monthlyRainfall = new double[12];
        for (int i = 0; i < 12; i++) {
            if (rainfall[i] < 0) {
                throw new IllegalArgumentException("Rainfall figures cannot be negative.");
            }
            monthlyRainfall[i] = rainfall[i];
        }
    }

    // Tính tổng lượng mưa
    public double getTotalRainfall() {
        double total = 0;
        for (double rain : monthlyRainfall) {
            total += rain;
        }
        return total;
    }

    // Tính trung bình lượng mưa hàng tháng
    public double getAverageRainfall() {
        return getTotalRainfall() / monthlyRainfall.length;
    }

    // Tìm tháng có lượng mưa lớn nhất
    public int getMonthWithMostRain() {
        int month = 0;
        double maxRain = monthlyRainfall[0];
        for (int i = 1; i < monthlyRainfall.length; i++) {
            if (monthlyRainfall[i] > maxRain) {
                maxRain = monthlyRainfall[i];
                month = i;
            }
        }
        return month + 1; // Trả về tháng (1-12)
    }

    // Tìm tháng có lượng mưa ít nhất
    public int getMonthWithLeastRain() {
        int month = 0;
        double minRain = monthlyRainfall[0];
        for (int i = 1; i < monthlyRainfall.length; i++) {
            if (monthlyRainfall[i] < minRain) {
                minRain = monthlyRainfall[i];
                month = i;
            }
        }
        return month + 1; // Trả về tháng (1-12)
    }
}

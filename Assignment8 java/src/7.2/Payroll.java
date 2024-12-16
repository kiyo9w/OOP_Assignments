public class Payroll {
    // Khai báo mảng các fields
    private int[] employeeId = { 5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489 };
    private int[] hours = new int[7];       // Số giờ làm của mỗi nhân viên
    private double[] payRate = new double[7]; // Mức lương theo giờ
    private double[] wages = new double[7];   // Tổng lương của nhân viên

    // Set hours làm việc và kiểm tra input
    public void setHours(int index, int hoursWorked) {
        if (hoursWorked < 0) {
            throw new IllegalArgumentException("Hours cannot be negative.");
        }
        hours[index] = hoursWorked;
    }

    // Set pay rate và kiểm tra input
    public void setPayRate(int index, double rate) {
        if (rate < 6.00) {
            throw new IllegalArgumentException("Pay rate must be at least 6.00.");
        }
        payRate[index] = rate;
    }

    // Tính lương cho từng nhân viên
    public void calculateWages() {
        for (int i = 0; i < employeeId.length; i++) {
            wages[i] = hours[i] * payRate[i];
        }
    }

    // Trả về ID nhân viên
    public int getEmployeeId(int index) {
        return employeeId[index];
    }

    // Trả về tổng lương của nhân viên
    public double getWages(int index) {
        return wages[index];
    }
}

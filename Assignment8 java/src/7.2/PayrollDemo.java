import java.util.Scanner;

public class PayrollDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Payroll payroll = new Payroll();

        System.out.println("Enter hours worked and pay rate for each employee:");

        // Vòng lặp nhập dữ liệu cho từng nhân viên
        for (int i = 0; i < 7; i++) {
            int hoursWorked;
            double payRate;

            // Hiển thị ID nhân viên
            System.out.println("Employee ID: " + payroll.getEmployeeId(i));

            // Nhập giờ làm việc với kiểm tra điều kiện
            while (true) {
                System.out.print("Enter hours worked: ");
                hoursWorked = input.nextInt();
                if (hoursWorked >= 0) {
                    break;
                }
                System.out.println("Hours cannot be negative. Please try again.");
            }
            payroll.setHours(i, hoursWorked);

            // Nhập mức lương với kiểm tra điều kiện
            while (true) {
                System.out.print("Enter hourly pay rate: ");
                payRate = input.nextDouble();
                if (payRate >= 6.00) {
                    break;
                }
                System.out.println("Pay rate must be at least 6.00. Please try again.");
            }
            payroll.setPayRate(i, payRate);
        }

        // Tính tổng lương
        payroll.calculateWages();

        // Hiển thị kết quả
        System.out.println("\nEmployee Wages:");
        for (int i = 0; i < 7; i++) {
            System.out.printf("Employee ID: %d | Gross Wages: %.2f\n",
                              payroll.getEmployeeId(i), payroll.getWages(i));
        }

        input.close();
    }
}

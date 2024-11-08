import java.util.Scanner;

public class payRollTest{
    public static void main(String[] args){

        payRoll PRex = new payRoll("test", "0000");

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("Please enter the information for a new employee: ");
        System.out.print("Name: ");
        PRex.setEmployeeName(sc.nextLine());

        System.out.print("Employee id: ");
        PRex.setId(sc.nextLine());

        System.out.print("Employee's hourly rate: ");
        PRex.setHourlyRate(sc.nextDouble());

        System.out.print("How many hours have they worked? ");
        PRex.setHourWorked(sc.nextInt());

        System.out.println("Employee " + PRex.getName() + " gross pay: " + PRex.getGrossPay());

        sc.close();
    }
}
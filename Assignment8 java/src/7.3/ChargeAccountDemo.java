import java.util.Scanner;

public class ChargeAccountDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ChargeAccount accountValidator = new ChargeAccount();

        // Nhập số tài khoản từ người dùng
        System.out.print("Enter a charge account number to validate: ");
        int accountNumber = input.nextInt();

        // Kiểm tra tính hợp lệ của số tài khoản
        if (accountValidator.isValidAccount(accountNumber)) {
            System.out.println("The account number " + accountNumber + " is VALID.");
        } else {
            System.out.println("The account number " + accountNumber + " is INVALID.");
        }

        input.close();
    }
}

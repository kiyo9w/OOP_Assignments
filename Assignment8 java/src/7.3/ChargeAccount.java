public class ChargeAccount {
    private int[] validAccountNumbers = {
        5658845, 4520125, 7895122, 8777541, 8451277, 1302850,
        8080152, 4562555, 5552012, 5050552, 7825877, 1250255,
        1005231, 6545231, 3852085, 7576651, 7881200, 4581002
    };

    // Phương thức kiểm tra số tài khoản có hợp lệ không
    public boolean isValidAccount(int accountNumber) {
        for (int validNumber : validAccountNumbers) {
            if (validNumber == accountNumber) {
                return true; // Tìm thấy số tài khoản
            }
        }
        return false; // Không tìm thấy
    }
}

import javax.swing.JOptionPane;

public class DisplayIntergers {
    public static void main(String[] args) {
        String firstInput = JOptionPane.showInputDialog("Hay nhap so thu 1:");
        String secondInput = JOptionPane.showInputDialog("Hay nhap so thu 2:");

        int firstNumber = Integer.parseInt(firstInput);
        int secondNumber = Integer.parseInt(secondInput);

        JOptionPane.showMessageDialog(null, "So thu 1: " + firstNumber);
        JOptionPane.showMessageDialog(null, "So thu 2: " + secondNumber);
    }
}
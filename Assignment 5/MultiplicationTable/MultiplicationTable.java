package MultiplicationTable;

import javax.swing.JOptionPane;

public class MultiplicationTable {
    public static void main(String[] args) {
        StringBuilder table = new StringBuilder();

        // Add the header and underline
        table.append("Multiplication Table\n");
        table.append("-------------------------------------------------------\n");

        // Add the top row of numbers
        table.append("    |");
        for (int i = 1; i <= 9; i++) {
            table.append(String.format("%6d", i));
        }
        table.append("\n");

        // Create the multiplication table using nested for loops
        for (int i = 1; i <= 9; i++) {
            table.append(String.format("%2d |", i));
            for (int j = 1; j <= 9; j++) {
                if (i*j >= 10){
                table.append(String.format("%5d", i * j));
                } else table.append(String.format("%6d", i * j));
            }
            table.append("\n");
        }

        // Display the multiplication table in a dialog box with the specified header
        JOptionPane.showMessageDialog(null, table.toString(), "Example 3.4 Output", JOptionPane.INFORMATION_MESSAGE);
    }
}



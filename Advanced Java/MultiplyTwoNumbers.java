import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MultiplyTwoNumbers {
    private JTextField num1Field, num2Field, resultField;
    private JButton multiplyButton;

    public MultiplyTwoNumbers() {
        JFrame frame = new JFrame("Lab-2 Advanced Java Kishor");

        JLabel num1Label = new JLabel("Enter First Number:");
        JLabel num2Label = new JLabel("Enter Second Number:");
        JLabel resultLabel = new JLabel("Result:");

        num1Field = new JTextField(10);
        num2Field = new JTextField(10);
        resultField = new JTextField(10);
        resultField.setEditable(false);

        multiplyButton = new JButton("Multiply");

        frame.setLayout(new GridLayout(4, 2, 5, 5));
        frame.add(num1Label); frame.add(num1Field);
        frame.add(num2Label); frame.add(num2Field);
        frame.add(resultLabel); frame.add(resultField);
        frame.add(new JLabel("")); frame.add(multiplyButton);

        multiplyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(num1Field.getText());
                    int num2 = Integer.parseInt(num2Field.getText());
                    int product = num1 * num2;
                    resultField.setText(String.valueOf(product));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter valid numbers!");
                }
            }
        });

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new MultiplyTwoNumbers();
    }
}

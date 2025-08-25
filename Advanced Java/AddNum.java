import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class AddNum {
    private JTextField num1Field, num2Field, resultField;
    private JButton addButton;
    public AddNum() {
        JFrame frame = new JFrame("Lab-1 Advanced Java Kishor");
        JLabel num1Label = new JLabel("Enter First Number:");
        JLabel num2Label = new JLabel("Enter Second Number:");
        JLabel resultLabel = new JLabel("Result:");
        num1Field = new JTextField(10);
        num2Field = new JTextField(10);
        resultField = new JTextField(10);
        resultField.setEditable(false);
        addButton = new JButton("Add");
        frame.setLayout(new GridLayout(4, 2, 5, 5));
        frame.add(num1Label); frame.add(num1Field);
        frame.add(num2Label); frame.add(num2Field);
        frame.add(resultLabel); frame.add(resultField);
        frame.add(new JLabel("")); frame.add(addButton);
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(num1Field.getText());
                    int num2 = Integer.parseInt(num2Field.getText());
                    int sum = num1 + num2;
                    resultField.setText(String.valueOf(sum));
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
        new AddNum();
    }
}

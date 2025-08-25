import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginForm {
    private JTextField userField;
    private JPasswordField passField;
    private JButton loginButton;
    //private JLabel resultLabel;

    public LoginForm() {
        JFrame frame = new JFrame("Lab-4 adv Java Kishor");

        JLabel userLabel = new JLabel("Username:");
        JLabel passLabel = new JLabel("Password:");
        //JLabel resultLabel = new JLabel("");

        userField = new JTextField(10);
        passField = new JPasswordField(10);
        loginButton = new JButton("Login");

        frame.setLayout(new GridLayout(3, 2, 5, 5));
        frame.add(userLabel); frame.add(userField);
        frame.add(passLabel); frame.add(passField);
        frame.add(new JLabel("")); frame.add(loginButton);

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = userField.getText();
                String password = new String(passField.getPassword());

                if(username.equals("admin") && password.equals("admin")) {
                    JOptionPane.showMessageDialog(frame, "Access Granted");
                } else {
                    JOptionPane.showMessageDialog(frame, "Access Denied");
                }
            }
        });

        frame.setSize(350, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new LoginForm();
    }
}

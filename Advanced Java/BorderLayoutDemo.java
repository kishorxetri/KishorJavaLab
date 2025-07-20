import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;

public class BorderLayoutDemo extends JFrame {

    public BorderLayoutDemo() {
        setTitle("BorderLayout Demo");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());

        JButton northButton = new JButton("NORTH");
        JButton southButton = new JButton("SOUTH");
        JButton eastButton = new JButton("EAST");
        JButton westButton = new JButton("WEST");
        JButton centerButton = new JButton("CENTER");

        add(northButton, BorderLayout.NORTH);
        add(southButton, BorderLayout.SOUTH);
        add(eastButton, BorderLayout.EAST);
        add(westButton, BorderLayout.WEST);
        add(centerButton, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> new BorderLayoutDemo());
    }
}

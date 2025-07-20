import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.GridLayout; // Import GridLayout
import java.awt.Color;
import java.awt.Font;

public class GridLayoutDemo extends JFrame {

    public GridLayoutDemo() {
        setTitle("GridLayout Demonstration");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Set the layout manager for the frame's content pane to GridLayout
        // GridLayout(rows, columns, horizontal_gap, vertical_gap)
        setLayout(new GridLayout(3, 3, 10, 10)); // 3 rows, 3 columns, 10px gaps

        Font buttonFont = new Font("Arial", Font.BOLD, 18);

        // Create and add 9 buttons to fill the 3x3 grid
        for (int i = 1; i <= 9; i++) {
            JButton button = new JButton("Cell " + i);
            button.setFont(buttonFont);
            button.setBackground(new Color(180 + i * 5, 220 - i * 10, 255)); // Varying colors
            button.setForeground(Color.DARK_GRAY);
            add(button); // Add button to the frame
        }

        setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> new GridLayoutDemo());
    }
}
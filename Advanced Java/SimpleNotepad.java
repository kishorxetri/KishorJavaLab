import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class SimpleNotepad {
    JTextArea textArea;
    JButton newButton, openButton, saveButton, exitButton;
    public SimpleNotepad() {
        JFrame frame = new JFrame("Notepad");
        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        newButton = new JButton("New");
        openButton = new JButton("Open");
        saveButton = new JButton("Save");
        exitButton = new JButton("Exit");

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(newButton);
        panel.add(openButton);
        panel.add(saveButton);
        panel.add(exitButton);

        frame.add(panel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);

        newButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.setText("");
            }
        });

        openButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int option = fileChooser.showOpenDialog(frame);
                if(option == JFileChooser.APPROVE_OPTION) {
                    File file = fileChooser.getSelectedFile();
                    try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
                        textArea.read(reader, null);
                    } catch(IOException ex) {
                        JOptionPane.showMessageDialog(frame, "Error opening file");
                    }
                }
            }
        });

        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int option = fileChooser.showSaveDialog(frame);
                if(option == JFileChooser.APPROVE_OPTION) {
                    File file = fileChooser.getSelectedFile();
                    try(BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                        textArea.write(writer);
                    } catch(IOException ex) {
                        JOptionPane.showMessageDialog(frame, "Error saving file");
                    }
                }
            }
        });

        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new SimpleNotepad();
    }
}

import javax.swing.*;
import java.awt.*;

public class StudentForm {
    public StudentForm() {
        JFrame frame = new JFrame("Lab 6 Adv Java Kishor");

        JLabel firstNameLabel = new JLabel("First Name:");
        JLabel lastNameLabel = new JLabel("Last Name:");
        JLabel ageLabel = new JLabel("Age:");
        JLabel genderLabel = new JLabel("Gender:");
        JLabel facultyLabel = new JLabel("Faculty:");
        JLabel semesterLabel = new JLabel("Semester:");
        JLabel remarksLabel = new JLabel("Remarks:");

        JTextField firstNameField = new JTextField(20);
        JTextField lastNameField = new JTextField(20);
        JTextField ageField = new JTextField(10);

        JRadioButton maleButton = new JRadioButton("Male");
        JRadioButton femaleButton = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);

        String[] faculties = {"IT", "Business", "Science", "Arts","Engineering"};
        JComboBox<String> facultyCombo = new JComboBox<>(faculties);

        String[] semesters = {"First", "Second", "Third", "Fourth", "Fifth", "Sixth", "Seventh", "Eighth"};
        JComboBox<String> semesterCombo = new JComboBox<>(semesters);

        JTextArea remarksArea = new JTextArea(8, 30);
        JScrollPane remarksScroll = new JScrollPane(remarksArea);

        JButton submitButton = new JButton("Submit");

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(8, 2, 10, 10));
        panel.add(firstNameLabel); panel.add(firstNameField);
        panel.add(lastNameLabel); panel.add(lastNameField);
        panel.add(ageLabel); panel.add(ageField);
        panel.add(genderLabel); 
        JPanel genderPanel = new JPanel();
        genderPanel.add(maleButton); genderPanel.add(femaleButton);
        panel.add(genderPanel);
        panel.add(facultyLabel); panel.add(facultyCombo);
        panel.add(semesterLabel); panel.add(semesterCombo);
        panel.add(remarksLabel); panel.add(remarksScroll);
        panel.add(new JLabel("")); panel.add(submitButton);

        frame.add(panel);
        frame.setSize(500, 550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new StudentForm();
    }
}

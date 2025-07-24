package view.components;

import javax.swing.*;
import java.awt.*;

public class InputPanel extends JPanel {
    private final JTextField nameField = new JTextField(20);
    private final JTextField emailField = new JTextField(20);
    private final JTextField phoneField = new JTextField(20);
    private final JTextField skillsField = new JTextField(20);
    private final JTextField educationField = new JTextField(20);
    private final JTextField experienceField = new JTextField(20);

    public InputPanel() {
        setLayout(new GridLayout(6, 2, 5, 5));
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        add(new JLabel("Name:"));
        add(nameField);
        add(new JLabel("Email:"));
        add(emailField);
        add(new JLabel("Phone:"));
        add(phoneField);
        add(new JLabel("Skills:"));
        add(skillsField);
        add(new JLabel("Education:"));
        add(educationField);
        add(new JLabel("Experience:"));
        add(experienceField);
    }

    public String[] getInputData() {
        return new String[] {
                nameField.getText(),
                emailField.getText(),
                phoneField.getText(),
                skillsField.getText(),
                educationField.getText(),
                experienceField.getText()
        };
    }

    public void clearFields() {
        nameField.setText("");
        emailField.setText("");
        phoneField.setText("");
        skillsField.setText("");
        educationField.setText("");
        experienceField.setText("");
    }
}
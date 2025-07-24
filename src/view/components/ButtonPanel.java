package view.components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ButtonPanel extends JPanel {
    private final JButton generateBtn = new JButton("Generate Resume");
    private final JButton saveBtn = new JButton("Save as Text");
    private final JButton resetBtn = new JButton("Reset");

    public ButtonPanel() {
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        generateBtn.setBackground(new Color(144, 238, 144));
        saveBtn.setBackground(new Color(173, 216, 230));
        resetBtn.setBackground(new Color(255, 182, 193));

        add(generateBtn);
        add(saveBtn);
        add(resetBtn);
    }

    public void setGenerateListener(ActionListener listener) {
        generateBtn.addActionListener(listener);
    }

    public void setSaveListener(ActionListener listener) {
        saveBtn.addActionListener(listener);
    }

    public void setResetListener(ActionListener listener) {
        resetBtn.addActionListener(listener);
    }
}
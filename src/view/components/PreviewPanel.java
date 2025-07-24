package view.components;

import javax.swing.*;
import java.awt.*;

public class PreviewPanel extends JPanel {
    private final JTextArea previewArea = new JTextArea(10, 40);

    public PreviewPanel() {
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createTitledBorder("Resume Preview"));

        previewArea.setFont(new Font("Courier New", Font.PLAIN, 14));
        previewArea.setEditable(false);

        add(new JScrollPane(previewArea), BorderLayout.CENTER);
    }

    public void setPreviewText(String text) {
        previewArea.setText(text);
    }

    public String getPreviewText() {
        return previewArea.getText();
    }

    public void clearPreview() {
        previewArea.setText("");
    }
}
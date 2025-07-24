package view;

import view.components.*;
import javax.swing.*;
import java.awt.*;

public class ResumeView extends JFrame {
    private final InputPanel inputPanel;
    private final ButtonPanel buttonPanel;
    private final PreviewPanel previewPanel;

    public ResumeView() {
        setTitle("Creative Resume Builder");
        setSize(700, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        // Создаем панели
        inputPanel = new InputPanel();
        buttonPanel = new ButtonPanel();
        previewPanel = new PreviewPanel();

        // Добавляем панели на форму
        add(inputPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
        add(previewPanel, BorderLayout.SOUTH);
    }

    public InputPanel getInputPanel() { return inputPanel; }
    public ButtonPanel getButtonPanel() { return buttonPanel; }
    public PreviewPanel getPreviewPanel() { return previewPanel; }
}
import controller.ResumeController;
import model.Resume;
import view.ResumeView;
import javax.swing.*;
import java.awt.event.ActionEvent;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Resume model = new Resume();
            ResumeController controller = new ResumeController(model);
            ResumeView view = new ResumeView();

            // Настройка обработчиков событий
            view.getButtonPanel().setGenerateListener(e -> {
                String[] data = view.getInputPanel().getInputData();
                controller.updateResume(data[0], data[1], data[2], data[3], data[4], data[5]);
                view.getPreviewPanel().setPreviewText(controller.generateResume());
            });

            view.getButtonPanel().setSaveListener(e -> {
                try {
                    controller.saveToFile("MyResume.txt", view.getPreviewPanel().getPreviewText());
                    JOptionPane.showMessageDialog(view, "Resume saved successfully!");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(view, "Error saving file: " + ex.getMessage());
                }
            });

            view.getButtonPanel().setResetListener(e -> {
                controller.clearResume();
                view.getInputPanel().clearFields();
                view.getPreviewPanel().clearPreview();
            });

            view.setVisible(true);
        });
    }
}
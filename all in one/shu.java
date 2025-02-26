import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class shu {
    public static void main(String[] args) {
        Frame frame = new Frame("Color Setter");
        frame.setSize(400, 300);

        Panel panel = new Panel();
        frame.add(panel);

        Label redLabel = new Label("Red:");
        TextField redField = new TextField(5);

        Label greenLabel = new Label("Green:");
        TextField greenField = new TextField(5);

        Label blueLabel = new Label("Blue:");
        TextField blueField = new TextField(5);

        Button setColorButton = new Button("Set Color");

        setColorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int red = Integer.parseInt(redField.getText());
                    int green = Integer.parseInt(greenField.getText());
                    int blue = Integer.parseInt(blueField.getText());

                    // Ensure values are in the valid range (0-255)
                    red = Math.max(0, Math.min(255, red));
                    green = Math.max(0, Math.min(255, green));
                    blue = Math.max(0, Math.min(255, blue));

                    panel.setBackground(new Color(red, green, blue));
                } catch (NumberFormatException ex) {
                    showMessageDialog(frame, "Please enter valid integer values for RGB.");
                }
            }
        });

        panel.add(redLabel);
        panel.add(redField);
        panel.add(greenLabel);
        panel.add(greenField);
        panel.add(blueLabel);
        panel.add(blueField);
        panel.add(setColorButton);

        frame.setVisible(true);
    }

    // A utility method for showing a simple dialog
    private static void showMessageDialog(Frame frame, String message) {
        Dialog dialog = new Dialog(frame, "Error", true);
        dialog.setLayout(new FlowLayout());
        dialog.add(new Label(message));
        Button okButton = new Button("OK");
        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dialog.dispose();
            }
        });
        dialog.add(okButton);
        dialog.setSize(200, 100);
        dialog.setVisible(true);
    }
}

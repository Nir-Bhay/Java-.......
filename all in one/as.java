import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class as {
    public static void main(String[] args) {
        Frame frame = new Frame("Even-Odd Checker");
        frame.setSize(300, 150);
        frame.setLayout(new FlowLayout());

        Label enterLabel = new Label("Enter a number:");
        TextField numberField = new TextField(10);
        Button checkButton = new Button("Check");
        Label resultLabel = new Label();

        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int number = Integer.parseInt(numberField.getText());
                    // String resu/lt;
                    if (number % 2 == 0) {
                        resultLabel.setText("even");
                    } else {
                        resultLabel.setText("add a valid number");
                    }
                    // resultLabel.setText("Result: " + result);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Error: Enter a valid number");
                }
            }
        });

        frame.add(enterLabel);
        frame.add(numberField);
        frame.add(checkButton);
        frame.add(resultLabel);

        frame.setVisible(true);
    }
}
